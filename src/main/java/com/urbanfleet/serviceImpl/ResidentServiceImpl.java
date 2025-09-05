package com.urbanfleet.serviceImpl;

import com.urbanfleet.model.Resident;
import com.urbanfleet.repository.ResidentRepository;
import com.urbanfleet.service.ResidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

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

    @Override
    public List<Resident> getByName(String fname, String lname)
    {
        List<Resident> result;
        if((fname == null || fname.isEmpty())  && (lname == null || lname.isEmpty()))
        {
            throw new IllegalArgumentException("Hey Sherlock! At least tell me a fname or lname to search!");
        }
        else if(fname!=null || !fname.isEmpty() && fname.matches("^[A-Za-z]+$") && (lname!=null || !lname.isEmpty())&& lname.matches("^[A-Za-z]+$"))
        {
            result= residentRepository.findByFnameIgnoreCaseOrLnameIgnoreCase(fname, lname);
        }
        else if (fname!=null || !fname.isEmpty() && fname.matches("^[A-Za-z]+$") && (lname==null || lname.isEmpty()))
        {
            result = residentRepository.findByFnameIgnoreCase(fname);
        }
        else
        {
            result = residentRepository.findByLnameIgnoreCase(lname);
        }
        if (result == null || result.isEmpty())
        {
            throw new IllegalArgumentException("🙃 Oops! No resident found with that name.");

        }
        return result;
    }


}
