package com.urbanfleet.controller;

import com.urbanfleet.model.Resident;
import com.urbanfleet.service.ResidentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/resident")
public class ResidentController
{
    @Autowired
    private ResidentService residentService;

    @PostMapping("/add")
    public ResponseEntity<String> addResident(@Valid @RequestBody Resident resident)
    {
        residentService.saveResident(resident);
        return  new ResponseEntity<>("✅ Resident Saved Successfully!", HttpStatus.CREATED);
    }
}
