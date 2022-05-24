package com.api.parkingcontrol.repositories;

import com.api.parkingcontrol.models.CarModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<CarModel, Long> {
}
