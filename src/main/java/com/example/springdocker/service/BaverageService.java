package com.example.springdocker.service;

import com.example.springdocker.model.Baverage;
import com.example.springdocker.model.Food;
import com.example.springdocker.repository.BaverageRepository;
import com.example.springdocker.repository.FoodRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class BaverageService {

private final BaverageRepository repository;

    public List<Baverage> getBaverages() {
        return repository.findAll();
    }

    public void saveNewBaverage(Baverage baverage) {
        repository.save(baverage);
    }

    public List<String> getDeliciousBaverages() {
        List<Baverage> deliciousBaverages = repository.findBaverageByDelicious(true);


        return deliciousBaverages.stream()
                .map(baverage -> baverage.getName())
                .collect(Collectors.toList());
    }
}
