package com.bala.app.controller;

import com.bala.app.model.Appointment;
import com.bala.app.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/doctor")
public class DoctorController
{
    @Autowired
    AppointmentRepository apprepository;
    @RequestMapping(value = "/doctorappointment",method = RequestMethod.GET)
    public Appointment getAppointments(@RequestParam("doctorName") String doctorName)
    {
        return apprepository.findBydoctorName(doctorName);
    }

    @RequestMapping(value = "/Save",method = RequestMethod.POST)
    public Appointment saveAppointment(@RequestBody Appointment appointment)
    {
        appointment = apprepository.save(appointment);
        return appointment;
    }
}
