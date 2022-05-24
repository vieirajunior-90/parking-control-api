package com.api.parkingcontrol.services;

import com.api.parkingcontrol.models.ParkingSpotModel;
import com.api.parkingcontrol.repositories.ParkingSpotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ParkingSpotService {

    @Autowired
    private ParkingSpotRepository parkingSpotRepository;

    public List<ParkingSpotModel> findAll() {
        return parkingSpotRepository.findAll();
    }

    public ParkingSpotModel findById(UUID id) {
        return parkingSpotRepository.findById(id).orElse(null);
    }
}

