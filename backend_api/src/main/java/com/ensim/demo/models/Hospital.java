package com.ensim.demo.models;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "dim_hospital", schema = "airbyte_schema")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hospital {
    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long hospital_id;
    private String hospital_name;
    private int patient_count;
    private int room_count;


}
