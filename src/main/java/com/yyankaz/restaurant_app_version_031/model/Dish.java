package com.yyankaz.restaurant_app_version_031.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import lombok.Data;
import lombok.Setter;

import java.util.List;

@Entity
@Data
public class Dish {
    @Id
    @GeneratedValue
    private Long id;
    private String dishName;
    @DecimalMin(value = "0.00", inclusive = false, message = "Price must be greater than 0")
    private Double dishPrice;
    private String dishDescription;
    private String dishImageURL;
    @ManyToMany
    private List<Ingredient> ingredients;
    @ManyToOne
    private DishCategory category;
    @OneToMany
    private List<OrderedDish> orderedDishes;

    public void setDishPrice(Double dishPrice) {
        if (dishPrice == null || dishPrice <= 0) {
            throw new IllegalArgumentException("Price must be greater than 0");
        }
        this.dishPrice = dishPrice;
    }

}
