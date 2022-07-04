package cn.johnyu.dao.impl;

import cn.johnyu.dao.UserDao;
import cn.johnyu.entity.MyGrantedAuthority;
import cn.johnyu.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

@Repository
public class UserDaoImpl implements UserDao {
    @Autowired private DataSource dataSource;
    @Override
    public User findUserByUsername(String username) {
        User user=null;
        Collection<MyGrantedAuthority> authorities=null;
        try {
//            String sql="select username,password,authority from users u left join authorities a on u.auth_id=a.id where username=?";
            String sql="select username,password,authority from users u left join user_auth ua on u.id=ua.user_id left join authorities a on a.id=ua.auth_id where username=?";
            Connection connection=dataSource.getConnection();
            PreparedStatement statement=connection.prepareStatement(sql);
            statement.setString(1,username);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){

                if(resultSet.isFirst()){
                    user=new User();
                    authorities=new ArrayList<>();
                    user.setUsername(resultSet.getString("username"));
                    user.setPassword(resultSet.getString("password"));
                }
                MyGrantedAuthority authority=new MyGrantedAuthority();

                authority.setAuthority(resultSet.getString("authority"));
                authorities.add(authority);
                user.setAuthorities(authorities);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }
}
