package com.urbanfleet.serviceImpl;

import com.urbanfleet.model.Vehicle;
import com.urbanfleet.repository.VehicleRepository;
import com.urbanfleet.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleServiceImpl implements VehicleService
{
    @Autowired
    private VehicleRepository vehicleRepository;

    @Override
    public String savevehicle(Vehicle vehicle)
    {
        vehicleRepository.save(vehicle);
        return "Vehicle Saved";
    }

    @Override
    public List<Vehicle> getAllVehicleData()
    {
        List<Vehicle> vehicleList=vehicleRepository.findAll();
        return vehicleList;
    }


}
