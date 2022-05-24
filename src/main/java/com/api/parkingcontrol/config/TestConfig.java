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

//        ParkingSpotModel PS1 = new ParkingSpotModel(
//                "10B",
//                LocalDateTime.now(ZoneId.of("America/Sao_Paulo")),
//                "Daniel Carvalho",
//                "302A",
//                "C"
//        );
//
//        CarModel C1 = new CarModel(
//                "KVG9AB2",
//                "Fiat",
//                "Uno",
//                "Black",
//                PS1
//        );


//        parkingSpotRepository.save(PS1);
//        carRepository.save(C1);

    }
}
