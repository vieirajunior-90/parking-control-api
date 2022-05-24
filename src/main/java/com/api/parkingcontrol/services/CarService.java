package com.api.parkingcontrol.services;

import com.api.parkingcontrol.models.CarModel;
import com.api.parkingcontrol.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public List<CarModel> findAll() {
        return carRepository.findAll();
    }

    public CarModel findById(Long id) {
        return carRepository.findById(id).orElse(null);
    }
}

