package com.urbanfleet.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@ToString
public class Vehicle
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonIgnore
    private long id;
    @NotBlank(message ="Oops!! Registration No. is missing")
    private String registrationNumber;
    @NotBlank(message ="Oops!! Vehicle Name is missing")
    private String vName;
    @NotBlank(message ="Oops!! Vehicle color is missing")
    private String color;
    @NotBlank(message ="Oops!! Vehicle Type is missing")
    private enum VType
    {
        CAR, MOPED, BIKE
    }
    @Enumerated(EnumType.STRING)
    private VType vtype;
    @NotBlank(message ="Oops!! Activation Time is missing")
    private LocalDateTime associationActivatedAt;
    private LocalDateTime associationDeactivatedAt;
    @NotBlank(message ="Oops!! Vehicle Status is missing")
    private boolean isVehicleActive;
    @ManyToOne
    @JoinColumn(name = "resident_id")
    @JsonManagedReference
    @JsonIgnore
    private Resident resident;

}
