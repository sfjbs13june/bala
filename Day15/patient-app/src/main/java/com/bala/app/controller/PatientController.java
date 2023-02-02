package com.bala.app.controller;

import com.bala.app.exception.*;
import com.bala.app.model.Patient;
import com.bala.app.service.PatientService;
import com.bala.app.exception.*;
import com.bala.app.exception.PatientAgeNotFoundException;
import com.bala.app.exception.PatientIdNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PatientController
{
    @Autowired
    PatientService patientService;
    @PostMapping("/patient/save")
    public Patient savePatient(@RequestBody Patient patient) throws PatientIdNotFoundException, PatientNameNotFoundException, PatientAgeNotFoundException, PatientGenderNotFoundException, PatientDiseaseNotFoundException {
        if(patient.getId()==null)
        {
            throw new PatientIdNotFoundException("There is no patient available");
        }
        if(patient.getName()==null)
        {
            throw new PatientNameNotFoundException("There is not Patient name here.");
        }
        if(patient.getAge()==null)
        {
            throw new PatientAgeNotFoundException("Patient age is not found.");
        }
        if(patient.getGender()==null)
        {
            throw new PatientGenderNotFoundException("Patient Gender is not found");
        }
        if(patient.getDisease()==null)
        {
            throw new PatientDiseaseNotFoundException("Patient disease id not found.");
        }
        System.out.println(patient);
        return patient;
    }
    @PutMapping("/patient/update")
    public Patient updatePatient(@RequestBody Patient patient,@RequestParam("disease") String disease)
    {
        return patientService.updateDetail(patient,disease);
    }
}
