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
import java.util.Optional;

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
    public ResponseEntity<Object> findById(@PathVariable("id") Long id) {
        Optional<CarModel> car = carService.findById(id);
        if(!car.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Car not found");
        }
        return ResponseEntity.status(HttpStatus.OK).body(car.get());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteCar(@PathVariable("id") Long id) {
        Optional<CarModel> car = carService.findById(id);
        if(!car.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Car not found");
        }
        carService.delete(car.get());
        return ResponseEntity.status(HttpStatus.OK).body("Car deleted");
    }
}
