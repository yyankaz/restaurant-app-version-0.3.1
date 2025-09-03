package com.yyankaz.restaurant_app_version_031.controller;

import com.yyankaz.restaurant_app_version_031.dto.RegisterRequest;
import com.yyankaz.restaurant_app_version_031.service.UserService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody @Valid RegisterRequest req) {
        userService.register(req);
        return ResponseEntity.ok().build();
    }

}
