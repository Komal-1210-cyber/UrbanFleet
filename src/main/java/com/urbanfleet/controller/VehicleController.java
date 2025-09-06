package com.urbanfleet.controller;

import com.urbanfleet.dto.VehicleRequest;
import com.urbanfleet.model.Vehicle;
import com.urbanfleet.service.VehicleService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehicle")
public class VehicleController
{
    @Autowired
    private VehicleService vehicleService;

    @PostMapping("/add")
    public ResponseEntity<String> addvehicle(@RequestBody VehicleRequest request)
    {
        try {
            vehicleService.savevehicle(request);
            return new ResponseEntity<>("✅ Vehicle Saved Successfully!", HttpStatus.CREATED);
        }
        catch (IllegalArgumentException e) {
            return new ResponseEntity<>("❌ " + e.getMessage(), HttpStatus.BAD_REQUEST);
        }

    }
    @GetMapping("/getAllData")
    public ResponseEntity<List<Vehicle>> getAllData()
    {
        List<Vehicle> vehicleList=vehicleService.getAllVehicleData();
        return  new ResponseEntity<>(vehicleList,HttpStatus.OK);

    }
}
