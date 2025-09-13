package com.urbanfleet.service;

import com.urbanfleet.dto.VehicleRequest;
import com.urbanfleet.dto.VehicleResponse;
import com.urbanfleet.model.Vehicle;
import com.urbanfleet.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface VehicleService
{

    String savevehicle(VehicleRequest request);
    public List<VehicleResponse> getAllVehicleData();

}
