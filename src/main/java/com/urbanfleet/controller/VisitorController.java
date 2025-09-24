package com.urbanfleet.controller;

import com.urbanfleet.dto.VehicleResponse;
import com.urbanfleet.dto.VisitorRequest;

import com.urbanfleet.dto.VisitorResponse;
import com.urbanfleet.model.Visitor;
import com.urbanfleet.service.VisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Visitor")
public class VisitorController
{
    @Autowired
    private VisitorService visitorService;

    @PostMapping("/addvisitor")
    private ResponseEntity<String> addVisitor(@RequestBody VisitorRequest visitorRequest)
    {
        visitorService.SaveVisitor(visitorRequest);
        return new ResponseEntity<>("Visitor Saved", HttpStatus.CREATED);
    }

    @GetMapping("/getByVisitorVehicleRegisterNum/{vRnum}")
    public ResponseEntity<VisitorResponse> getByvRNum(@PathVariable String vRnum)
    {
        VisitorResponse visitorResponse=visitorService.getByvRNum(vRnum);
        return new ResponseEntity<>(visitorResponse, HttpStatus.OK);


    }

}
