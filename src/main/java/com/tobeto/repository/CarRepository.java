package com.tobeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tobeto.entities.Car;

public interface CarRepository extends JpaRepository<Car, Integer> {

}
