package com.urbanfleet.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.urbanfleet.dto.VisitorResponse;
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
public class Visitor extends VisitorResponse {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonIgnore
    private int id;
    @NotBlank(message ="Hey visitor, I need your name!")
    private String visitorName;
    @NotBlank(message = "Please tell me your vehicle name.")
    private String vehicleName;
    @NotBlank(message =" I need your vehicle registration number.")
    private String vRNum;
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
    @JsonIgnore
    private VisitorType visitortype;
    @ManyToOne
    @JoinColumn(name="resident_id")
    @JsonManagedReference
    private Resident resident;
}
