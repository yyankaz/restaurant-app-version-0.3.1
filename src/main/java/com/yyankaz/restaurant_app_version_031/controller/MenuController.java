package com.yyankaz.restaurant_app_version_031.controller;

import com.yyankaz.restaurant_app_version_031.service.MenuService;
import com.yyankaz.restaurant_app_version_031.service.RestaurantOrderService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class MenuController {
    private final MenuService menuService;
    private final RestaurantOrderService restaurantOrderService;


    public void getCategories(){

    }

}
