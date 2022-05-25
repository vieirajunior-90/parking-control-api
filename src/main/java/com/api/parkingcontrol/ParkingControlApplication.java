package com.api.parkingcontrol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ParkingControlApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParkingControlApplication.class, args);
	}

	@GetMapping("/")
	public String parkingControlAPI() {
		return "<h1>Parking Control API</h1>" +
				"<p>This API is used to control the parking spots and cars.</p>" +
				"<p>The API is available at: " +
				"<ul>" +
				"<li><a href=\"http://localhost:8080/parking-spot\">PARKING SPOT</a></p></li>" +
				"<li><a href=\"http://localhost:8080/cars\">CARS</a></p><li>" +
				"</ul>";

	}

}
