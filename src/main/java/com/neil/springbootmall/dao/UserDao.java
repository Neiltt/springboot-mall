package com.neil.springbootmall.dao;

import com.neil.springbootmall.dto.UserRegisterRequest;
import com.neil.springbootmall.model.User;

public interface UserDao {
    User getUserById(Integer userId);
    User getUserByEmail(String email);
    Integer createUser(UserRegisterRequest userRegisterRequest);
}
