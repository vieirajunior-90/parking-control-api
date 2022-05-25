package com.api.parkingcontrol.config;

import com.api.parkingcontrol.models.CarModel;
import com.api.parkingcontrol.models.ParkingSpotModel;
import com.api.parkingcontrol.repositories.CarRepository;
import com.api.parkingcontrol.repositories.ParkingSpotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private CarRepository carRepository;

    @Autowired
    private ParkingSpotRepository parkingSpotRepository;

    @Override
    public void run(String... args) throws Exception {

//        ParkingSpotModel PS1 = new ParkingSpotModel(
//                "02-B",
//                LocalDateTime.now(ZoneId.of("UTC")),
//                "Tatiana Macedo",
//                "212",
//                "A"
//        );
//
//        CarModel C1 = new CarModel(
//                "DHC2A23",
//                "Volkswagen",
//                "Gol",
//                "Silver"
//        );
//
//        ParkingSpotModel PS2 = new ParkingSpotModel(
//                "07-A",
//                LocalDateTime.now(ZoneId.of("UTC")),
//                "Jonathan Silva",
//                "403",
//                "B"
//        );
//
//        CarModel C2 = new CarModel(
//                "OOP8Y42",
//                "Volkswagen",
//                "Voyage",
//                "Black"
//        );
//
//        ParkingSpotModel PS3 = new ParkingSpotModel(
//                "01-A",
//                LocalDateTime.now(ZoneId.of("UTC")),
//                "José Camargo",
//                "1101",
//                "A"
//        );
//
//        CarModel C3 = new CarModel(
//                "PIP4D42",
//                "Ford",
//                "EcoSport",
//                "Blue"
//        );
//
//        PS1.setCarModel(C1);
//        PS2.setCarModel(C2);
//        PS3.setCarModel(C3);
//
//        carRepository.saveAll(Arrays.asList(C1, C2, C3));
//        parkingSpotRepository.saveAll(Arrays.asList(PS1, PS2, PS3));
//        parkingSpotRepository.save(PS3);

    }
}
