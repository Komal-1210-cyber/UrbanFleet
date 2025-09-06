package com.urbanfleet.service;

import com.urbanfleet.dto.ResidentRequest;
import com.urbanfleet.model.Resident;

import java.util.List;

public interface ResidentService
{
    String saveResident(ResidentRequest request);
    List<Resident> getAllResidentData();
    List<Resident> getByName(String fname, String lname);
}
