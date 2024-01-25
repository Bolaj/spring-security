package com.project.springsecurity.service;

import com.project.springsecurity.entity.User;
import com.project.springsecurity.model.UserModel;

public interface UserService {
    User registerUser(UserModel userModel);

    void saveVerificationToken(String token, User user);
}
