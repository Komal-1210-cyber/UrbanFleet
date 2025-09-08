package com.urbanfleet.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ResidentRequest
{
    private String fname;
    private String lname;
    private String flatno;
    private long mobileno;
    private String email;
    private String rtype;
}
