package com.urbanfleet.dto;

import com.urbanfleet.model.Vehicle;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Setter
@Getter
public class VehicleResponse
{
    private long id;
    private String registrationNumber;
    private String vName;
    private String color;
    private Vehicle.VType vtype;
    private LocalDateTime associationActivatedAt;
    private LocalDateTime associationDeactivatedAt;
    private boolean isVehicleActive;
    private int resident_id;

    public VehicleResponse(Vehicle vehicle) {
        this.id = vehicle.getId();
        this.registrationNumber = vehicle.getRegistrationNumber();
        this.vName = vehicle.getVName();
        this.color = vehicle.getColor();
        this.vtype = vehicle.getVtype();
        this.associationActivatedAt = vehicle.getAssociationActivatedAt();
        this.associationDeactivatedAt = vehicle.getAssociationDeactivatedAt();
        this.isVehicleActive = vehicle.isVehicleActive();
        this.resident_id = vehicle.getResident().getId();
    }
}
