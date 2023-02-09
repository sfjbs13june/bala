package com.bala.app.component;

import com.bala.app.model.Appointment;
import com.bala.app.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "doctor")
public class DoctorController {
    @Autowired
    AppointmentRepository appointmentRepo;
    @RequestMapping(value = "doctorappointment",method = RequestMethod.GET)
    public List<Appointment> getAppointments(@RequestParam String doctorName){

        return appointmentRepo.findBydoctorName(doctorName);
    }
    @RequestMapping(value = "save",method = RequestMethod.POST)
    public Appointment saveAppointment(@RequestBody Appointment appointment){
        appointment = appointmentRepo.save(appointment);
        return appointment;
    }
}
