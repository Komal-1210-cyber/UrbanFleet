package com.urbanfleet.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.urbanfleet.model.Resident;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class VisitorRequest
{

    private String visitorName;
    private String vehicleName;
    private String vRNum;

    private String visitPurpose;
    private LocalDateTime timein;
    private LocalDateTime timeout;
    private Long phoneNumber;
    private boolean isActiveVisitor;
    public String VisitorType;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Integer residentId;
}
