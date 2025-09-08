package com.urbanfleet.repository;

import com.urbanfleet.model.Resident;
import com.urbanfleet.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface VehicleRepository extends JpaRepository<Vehicle, Long>
{
    Optional<Vehicle> findByregistrationNumber(String registrationnumber);
}
