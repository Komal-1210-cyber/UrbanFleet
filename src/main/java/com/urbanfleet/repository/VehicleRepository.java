package com.urbanfleet.repository;

import com.urbanfleet.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Long>
{
}
