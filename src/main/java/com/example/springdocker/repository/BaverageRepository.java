package com.example.springdocker.repository;

import com.example.springdocker.model.Baverage;
import com.example.springdocker.model.Food;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BaverageRepository extends MongoRepository<Baverage, String> {

    List<Baverage> findBaverageByDelicious(boolean isDelisious);
}
