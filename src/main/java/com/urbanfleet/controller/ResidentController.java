package com.urbanfleet.controller;

import com.urbanfleet.model.Resident;
import com.urbanfleet.service.ResidentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/getAllData")
    public ResponseEntity<List<Resident>> getData()
    {
        List<Resident> residentList = residentService.getAllResidentData();
        return new ResponseEntity<>(residentList,HttpStatus.OK);
    }
    @GetMapping("/getByName")
    public ResponseEntity<List<Resident>> getByName(@RequestParam(required = false) String fname, @RequestParam(required = false)  String lname)
    {
        List<Resident> residentbynamelist = residentService.getByName(fname, lname);
        return new  ResponseEntity<>(residentbynamelist, HttpStatus.OK);
    }
}
