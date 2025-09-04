package com.yyankaz.restaurant_app_version_031.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Setter;

import java.util.List;

@Entity
@Data
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

    public void setDrinkPrice(Double drinkPrice){
        if (drinkPrice == null || drinkPrice <= 0) {
            throw new IllegalArgumentException("Price must be greater than 0");
        }

        this.drinkPrice = drinkPrice;
    }

}
