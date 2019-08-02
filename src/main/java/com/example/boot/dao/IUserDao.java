package com.example.boot.dao;

import com.example.boot.domain.User;

import java.util.List;

public interface IUserDao {
    int add(User user);

    int update(User user);

    int delete(User user);

    User findUser(Long id);

    List<User> findUserList();
}
