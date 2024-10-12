package com.project.uber.services;

import com.project.uber.dto.SignupDto;

public interface AuthService {

    String login(String email, String password);

    String signup(SignupDto signupDto);

    String onboardNewDriver(Long userId);
}
