package com.ensim.demo.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ensim.demo.models.Hospital;
import com.ensim.demo.services.HospitalService;

@RestController
public class HospitalController {

    @Autowired
    private  HospitalService hospitalService;

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/api/hospitals")
    public List<Hospital> getAllHospitals() {
        System.out.println("heelo ");
        return hospitalService.getAllHospitals() ;
    }
    
}
