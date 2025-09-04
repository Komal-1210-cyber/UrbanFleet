package com.urbanfleet.serviceImpl;

import com.urbanfleet.model.Resident;
import com.urbanfleet.repository.ResidentRepository;
import com.urbanfleet.service.ResidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResidentServiceImpl implements ResidentService
{
    @Autowired
    private ResidentRepository residentRepository;

    @Override
    public String saveResident(Resident resident)
    {
        residentRepository.save(resident);
        return "Resident Saved";
    }

    @Override
    public List<Resident> getAllResidentData()
    {
        List<Resident> residentList= residentRepository.findAll();
        return residentList;
    }
}
