package com.ensim.demo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ensim.demo.models.Hospital;
import com.ensim.demo.repostiories.HospitalRepo;
import com.ensim.demo.services.HospitalService;

@Service
public class HospitalServiceImpl implements HospitalService {

    @Autowired
    private HospitalRepo hospitalRepo;
    @Override
    public List<Hospital> getAllHospitals() {
        
        return hospitalRepo.findAll();
    }

    
}
