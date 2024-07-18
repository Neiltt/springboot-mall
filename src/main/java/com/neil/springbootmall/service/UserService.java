package com.neil.springbootmall.service;

import com.neil.springbootmall.dto.UserRegisterRequest;
import com.neil.springbootmall.model.User;

public interface UserService {
    User getUserById(Integer userId);
    Integer register(UserRegisterRequest userRegisterRequest);
}
