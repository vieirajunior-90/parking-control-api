package com.api.parkingcontrol.controllers;

import com.api.parkingcontrol.models.CarModel;
import com.api.parkingcontrol.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping
    public ResponseEntity<List<CarModel>> findAll() {
        List<CarModel> cars = carService.findAll();
        return ResponseEntity.ok().body(cars);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CarModel> findById(@PathVariable("id") Long id) {
        CarModel car = carService.findById(id);
        return ResponseEntity.ok().body(car);
    }
}
