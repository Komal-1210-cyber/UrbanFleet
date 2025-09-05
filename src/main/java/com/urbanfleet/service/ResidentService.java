package com.urbanfleet.service;

import com.urbanfleet.model.Resident;

import java.util.List;

public interface ResidentService
{
    String saveResident(Resident resident);
    List<Resident> getAllResidentData();
    List<Resident> getByName(String fname, String lname);
}
