package com.example.springdocker.controller;

import com.example.springdocker.model.Food;
import com.example.springdocker.service.FoodService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class FoodController {
    private final FoodService service;

    @GetMapping("/foods")
    public List<Food> getFoods() {
        return service.getFoods();
    }

    @PostMapping("/foods")
    public void saveNewFood(@RequestBody Food food) {
        service.saveNewFood(food);
    }

    @GetMapping("/foods/cookable")
    public List<String> getCookableoods() {
        return service.getCookableFoods();
    }

    @GetMapping("/foods/delete")
    public void deleteFood(@RequestParam String food) {

        service.deleteFood(food);
    }
}
