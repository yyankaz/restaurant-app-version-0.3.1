package com.yyankaz.restaurant_app_version_031.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Drink {
    @Id
    @GeneratedValue
    private Long id;
    private String drinkName;
    private Double drinkPrice;
    private String drinkDescription;
    private String drinkImageURL;
    @ManyToMany
    private List<Ingredient> ingredients;
    @ManyToOne
    private DrinkCategory category;
    @OneToMany
    private List<OrderedDrink> orderedDrinks;

}
