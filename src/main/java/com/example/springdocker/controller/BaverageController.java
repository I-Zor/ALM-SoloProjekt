package com.example.springdocker.controller;

import com.example.springdocker.model.Baverage;
import com.example.springdocker.model.Food;
import com.example.springdocker.service.BaverageService;
import com.example.springdocker.service.FoodService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class BaverageController {
    private final BaverageService service;

    @GetMapping("/baverage")
    public List<Baverage> getBaverage() {
        return service.getBaverages();
    }

    @PostMapping("/baverage")
    public void saveNewBaverage(@RequestBody Baverage baverage) {
        service.saveNewBaverage(baverage);
    }

    @GetMapping("/baverage/delicious")
    public List<String> getDeliciousBaverages() {
        return service.getDeliciousBaverages();
    }
}
