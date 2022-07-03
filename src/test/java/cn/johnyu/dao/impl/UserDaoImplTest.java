package cn.johnyu.dao.impl;

import cn.johnyu.dao.UserDao;
import cn.johnyu.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserDaoImplTest {
    @Autowired private UserDao userDao;
    @Test
    public void testFind(){
        User user = userDao.findUserByUsername("alice");
        user.getAuthorities().stream().forEach(a-> System.out.println(a.getAuthority()));
        assertTrue(user.getPassword().equals("123"));
    }
}