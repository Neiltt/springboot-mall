package com.neil.springbootmall.service.impl;

import com.neil.springbootmall.dao.UserDao;
import com.neil.springbootmall.dto.UserRegisterRequest;
import com.neil.springbootmall.model.User;
import com.neil.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }
}