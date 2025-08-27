package com.yyankaz.restaurant_app_version_031.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/homepage")
public class HomeController {

    private MenuController menuController;

    @GetMapping
    public void getMenu(){
        
    }

}
