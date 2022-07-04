package cn.johnyu.mapper;

import cn.johnyu.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserMapperTest {
    
    @Autowired private UserMapper userMapper;
    @Test public void testFind(){
        User user = userMapper.findUserByUsername("tom");
        System.out.println(user.getPassword());
        user.getAuthorities().stream().forEach(a-> System.out.println(a.getAuthority()));
    }
}