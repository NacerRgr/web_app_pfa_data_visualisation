package com.ensim.demo.repostiories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ensim.demo.models.Hospital;

public interface HospitalRepo extends JpaRepository<Hospital, Long>{

    
    
}
