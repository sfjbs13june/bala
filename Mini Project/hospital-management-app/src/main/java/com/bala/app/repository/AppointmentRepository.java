package com.bala.app.repository;

import com.bala.app.model.Appointment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppointmentRepository extends MongoRepository<Appointment,String> {
    public List<Appointment> findByDoctorName(String doctorName);
    public Appointment save(Appointment appointment);
    public List<Appointment> findByPatientName(String patientName);

}
