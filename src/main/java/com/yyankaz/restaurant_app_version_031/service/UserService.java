package com.yyankaz.restaurant_app_version_031.service;

import com.yyankaz.restaurant_app_version_031.dto.RegisterRequest;
import com.yyankaz.restaurant_app_version_031.model.User;
import com.yyankaz.restaurant_app_version_031.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.yyankaz.restaurant_app_version_031.model.Role;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public User register(RegisterRequest req) {
        userRepository.findByUsername(req.username())
                .ifPresent(u -> { throw new IllegalStateException("Username already taken"); });
        userRepository.findByEmail(req.email())
                .ifPresent(u -> { throw new IllegalStateException("Email already used"); });

        User user = User.builder()
                .username(req.username())
                .email(req.email())
                .firstName(req.firstName())
                .lastName(req.lastName())
                .password(passwordEncoder.encode(req.password()))
                .build();
        user.getRoles().add(Role.ROLE_CUSTOMER);
        return userRepository.save(user);
    }
}
