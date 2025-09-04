package com.urbanfleet.controller;

import com.urbanfleet.model.Vehicle;
import com.urbanfleet.service.VehicleService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vehicle")
public class VehicleController
{
    @Autowired
    private VehicleService vehicleService;

    @PostMapping("/add")
    public ResponseEntity<String> addvehicle(@Valid @RequestBody Vehicle vehicle)
    {
        vehicleService.savevehicle(vehicle);
        return new ResponseEntity<>("✅ Vehicle Saved Successfully!", HttpStatus.CREATED);

    }
}
