package com.neil.springbootmall.service;

import com.neil.springbootmall.dto.UserLoginRequest;
import com.neil.springbootmall.dto.UserRegisterRequest;
import com.neil.springbootmall.model.User;

public interface UserService {
    User login(UserLoginRequest userLoginRequest);
    User getUserById(Integer userId);
    Integer register(UserRegisterRequest userRegisterRequest);
}
