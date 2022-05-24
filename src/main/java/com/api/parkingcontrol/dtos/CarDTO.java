package com.api.parkingcontrol.dtos;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class CarDTO {

    @NotBlank
    @Size(max = 7)
    private String licensePlate;

    @NotBlank
    private String brand;

    @NotBlank
    private String model;

    @NotBlank
    private String color;
}
