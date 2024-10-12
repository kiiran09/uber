package com.project.uber.services.impl;

import com.project.uber.dto.SignupDto;
import com.project.uber.services.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    @Override
    public String login(String email, String password) {
        return "";
    }

    @Override
    public String signup(SignupDto signupDto) {
        return "";
    }

    @Override
    public String onboardNewDriver(Long userId) {
        return "";
    }
}
