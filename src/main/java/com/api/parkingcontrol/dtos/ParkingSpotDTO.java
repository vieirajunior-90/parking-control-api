package com.api.parkingcontrol.dtos;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class ParkingSpotDTO {

    @NotBlank
    private String parkingSpotNumber;

    @NotBlank
    private String responsibleName;

    @NotBlank
    private String apartment;

    @NotBlank
    private String block;
}
