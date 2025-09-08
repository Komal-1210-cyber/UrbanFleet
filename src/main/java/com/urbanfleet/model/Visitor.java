package com.urbanfleet.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
@Setter
@Getter
@ToString
@Entity
public class Visitor
{
    @Id
    private int id;
    @NotBlank(message ="Hey visitor, I need your name!")
    private String visitorName;
    @NotBlank(message = "Please tell me your vehicle name.")
    private String vehicleName;
    @NotBlank(message =" I need your vehicle registration number.")
    private String VehicleRegistationNumber;
    @NotBlank(message="What’s the purpose of your visit?")
    private String visitPurpose;
    private LocalDateTime timein;
    private LocalDateTime timeout;
    @NotNull(message = "Can I get your Number!")
    private Long phoneNumber;
    private boolean isActiveVisitor;
    @NotNull(message = "Who are you??")
    public enum VisitorType
    {
        GUEST,
        DELIVERY,
        TECHNICIAN,
        CLEANER
    }
    @Enumerated(EnumType.STRING)
    private VisitorType visitortype;
    @ManyToOne
    @JoinColumn(name="resident_id")
    private Resident resident;
}
