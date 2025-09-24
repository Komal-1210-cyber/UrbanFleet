package com.urbanfleet.dto;

import com.urbanfleet.model.Visitor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Setter
@Getter
public class VisitorResponse
{
    private String visitorName;
    private String vehicleName;
    private String vRNum;
    private String visitPurpose;
    private LocalDateTime timein;
    private LocalDateTime timeout;
    private Long phoneNumber;
    private boolean isActiveVisitor;
    private Visitor.VisitorType visitortype;
    private int resident_id;
    private ResidentResponse residentResponse;

    public VisitorResponse(Visitor visitor) {
        this.visitorName = visitor.getVisitorName();
        this.vehicleName = visitor.getVehicleName();
        this.vRNum = visitor.getVRNum();
        this.visitPurpose = visitor.getVisitPurpose();
        this.timein = visitor.getTimein();
        this.timeout = visitor.getTimeout();
        this.phoneNumber = visitor.getPhoneNumber();
        this.isActiveVisitor = visitor.isActiveVisitor();
        this.visitortype = visitor.getVisitortype();

        if(visitor.getResident()!=null) {
            this.resident_id = visitor.getId();
            this.residentResponse = new ResidentResponse(visitor.getResidentResponse());
        }
    }

    public VisitorResponse() {
    }
}
