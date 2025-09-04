package com.urbanfleet.service;

import com.urbanfleet.model.Vehicle;

import java.util.List;

public interface VehicleService
{
    String savevehicle(Vehicle vehicle);
    List<Vehicle> getAllVehicleData();
}
