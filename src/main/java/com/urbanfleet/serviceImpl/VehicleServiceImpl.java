package com.urbanfleet.serviceImpl;

import com.urbanfleet.dto.VehicleRequest;
import com.urbanfleet.dto.VehicleResponse;
import com.urbanfleet.model.Vehicle;
import com.urbanfleet.repository.ResidentRepository;
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

    @Autowired
    private ResidentRepository residentRepository;

    @Override
    public String savevehicle(VehicleRequest request)
    {
        Vehicle vehicle = new Vehicle();
        vehicle.setRegistrationNumber(request.getRegistrationNumber());
        vehicle.setVName(request.getVName());
        vehicle.setColor(request.getColor());
        vehicle.setVtype(Vehicle.VType.valueOf(request.getVtype().toUpperCase()));
        vehicle.setAssociationActivatedAt(request.getAssociationActivatedAt());
        vehicle.setAssociationDeactivatedAt(request.getAssociationDeactivatedAt());
        vehicle.setVehicleActive(request.isVehicleActive());
        var resident = residentRepository.findById(request.getResidentId())
                .orElseThrow(() -> new IllegalArgumentException("❌ Resident not found with ID: " + request.getResidentId()));

        vehicle.setResident(resident);

        vehicleRepository.save(vehicle);
        return "Vehicle Saved";
    }

    @Override
    public List<VehicleResponse> getAllVehicleData()
    {
        return vehicleRepository.findAll().stream().map(VehicleResponse::new).toList();

    }


}
