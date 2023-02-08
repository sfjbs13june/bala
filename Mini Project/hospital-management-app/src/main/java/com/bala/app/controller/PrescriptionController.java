package com.bala.app.controller;

import com.bala.app.model.Prescription;
import com.bala.app.repository.PrescriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/prescription")
public class PrescriptionController
{
    @Autowired
    PrescriptionRepository prescriptionRepository;
    @RequestMapping(value = "/viewprescription",method = RequestMethod.GET)
    public List<Prescription> getAllPrescriptions()
    {
        return prescriptionRepository.findAll();
    }

    @RequestMapping(value = "/saveprescription",method = RequestMethod.POST)
    public Prescription savePrescription(@RequestBody Prescription prescription){
        prescription = prescriptionRepository.save(prescription);
        return prescription;
    }
}
