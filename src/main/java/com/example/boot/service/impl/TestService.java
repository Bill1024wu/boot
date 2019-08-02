package com.example.boot.service.impl;

import com.example.boot.dao.impl.UserDao;
import com.example.boot.domain.User;
import com.example.boot.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService implements ITestService {
    @Autowired
    private UserDao userDao;

    @Override
    public int testInterFace() {
        return 0;
    }

    @Override
    public List<User> getAll() {
        return userDao.findUserList();
    }
}
