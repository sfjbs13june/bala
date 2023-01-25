package com.bala.app.controller;

public class PatientController {
    @RequestMapping("/patient")



        @GetMapping("/myappointment")
        public List<Appointment> getMyAppointments(@RequestParam String patientName){

        }

        @PostMapping("/save")
        public Appointment saveAppointment(@RequestBody Appointment appointment){

        }
}
