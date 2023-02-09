package com.bala.app.component;

import com.bala.app.model.Prescription;
import com.bala.app.repository.PrescriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("prescription")
public class PrescriptionController {
    @Autowired
    PrescriptionRepository prescriptionRepo;
    @RequestMapping(value = "viewprescription",method = RequestMethod.GET)
    public List<Prescription> getAllPrescriptions(String patientName){
        return prescriptionRepo.findBypatientName(patientName);

    }

    @PostMapping("/saveprescription")
    public Prescription savePrescription(@RequestBody Prescription prescription){

        prescription = prescriptionRepo.save(prescription);
        System.out.println(prescription);
        return prescription;
    }
}
