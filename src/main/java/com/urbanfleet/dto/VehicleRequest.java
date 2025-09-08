package com.urbanfleet.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Setter
@Getter
public class VehicleRequest
{
    private String registrationNumber;
    private String vName;
    private String color;
    private String vtype;
    private LocalDateTime associationActivatedAt;
    private LocalDateTime associationDeactivatedAt;
    private boolean isVehicleActive;


    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private int residentId;
}
