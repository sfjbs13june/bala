package com.bala.app.repository;

import com.bala.app.model.Appointment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppointmentRepository extends MongoRepository<Appointment,String>{
    public Appointment save(Appointment customer);
    public List<Appointment> findBydoctorName(String doctorName);
    public List<Appointment> findBypatientName(String patientName);

}
