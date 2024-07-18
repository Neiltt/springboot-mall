package com.neil.springbootmall.dao;

import com.neil.springbootmall.dto.UserRegisterRequest;
import com.neil.springbootmall.model.User;

public interface UserDao {
    User getUserById(Integer userId);
    Integer createUser(UserRegisterRequest userRegisterRequest);
}
