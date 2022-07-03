package cn.johnyu.dao;

import cn.johnyu.entity.User;

public interface UserDao {

    User findUserByUsername(String username);
}
