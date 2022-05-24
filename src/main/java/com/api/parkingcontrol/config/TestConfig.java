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

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private CarRepository carRepository;

    @Autowired
    private ParkingSpotRepository parkingSpotRepository;

    @Override
    public void run(String... args) throws Exception {
//
//        ParkingSpotModel PS1 = new ParkingSpotModel(
//                "10A",
//                LocalDateTime.now(ZoneId.of("UTC")),
//                "Tatiana Macedo",
//                "212B",
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
//        PS1.setCarModel(C1);
//
//        carRepository.save(C1);
//        parkingSpotRepository.save(PS1);

    }
}
