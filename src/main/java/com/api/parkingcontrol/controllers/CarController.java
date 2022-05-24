package com.api.parkingcontrol.controllers;

import com.api.parkingcontrol.dtos.CarDTO;
import com.api.parkingcontrol.dtos.ParkingSpotDTO;
import com.api.parkingcontrol.models.CarModel;
import com.api.parkingcontrol.models.CarModel;
import com.api.parkingcontrol.services.CarService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarService carService;

    @PostMapping
    public ResponseEntity<Object> saveCar(@RequestBody @Valid CarDTO carDTO){
        if(carService.existsByLicensePlate(carDTO.getLicensePlate())){
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Car license plate already exists");
        }

        var carModel = new CarModel();
        BeanUtils.copyProperties(carDTO, carModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(carService.save(carModel));
    }

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
