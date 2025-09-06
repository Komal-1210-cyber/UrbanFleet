package com.urbanfleet.service;

import com.urbanfleet.dto.VehicleRequest;
import com.urbanfleet.model.Vehicle;

import java.util.List;

public interface VehicleService
{
    String savevehicle(VehicleRequest request);
    List<Vehicle> getAllVehicleData();
}
