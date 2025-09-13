package com.urbanfleet.dto;

import com.urbanfleet.model.Resident;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ResidentResponse
{

    private int id;
    private String fname;
    private String lname;
    private String flatno;
    private long mobileno;
    private String email;


    public ResidentResponse(Resident resident) {
        this.id = resident.getId();
        this.fname = resident.getFname();
        this.lname = resident.getLname();
        this.flatno = resident.getFlatno();
        this.mobileno = resident.getMobileno();
        this.email = resident.getEmail();
    }

    public ResidentResponse(ResidentResponse residentResponse) {
    }
}
