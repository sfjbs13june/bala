package com.bala.app;

import com.bala.app.controller.PatientController;
import com.bala.app.model.Appointment;
import com.bala.app.model.Prescription;
import com.bala.app.repository.AppointmentRepository;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
public class PatientControllerTest {
    @InjectMocks
    private PatientController patientController;
    @Mock
    Appointment appointment;
    @Mock
    AppointmentRepository appointmentRepository;
    @BeforeEach
    void setUp(){
        appointment= Mockito.mock(Appointment.class);
        appointmentRepository=Mockito.mock(AppointmentRepository.class);
    }

    @Test
    public void TestGetAppointments() {
        List<Appointment> getMyAppointment = new ArrayList();
        Prescription prescription1 = new Prescription("p01","a02","cold","pat01","02");
        Appointment appointmentpatient = new Appointment("a02","pat01","doc02","11 august",prescription1);
        getMyAppointment.add(appointmentpatient);
        when(appointmentRepository.findByPatientName(anyString())).thenReturn(getMyAppointment);
        List<Appointment> result = patientController.getMyAppointments("pat01");
        assertEquals(getMyAppointment.size(), 1);
        assertEquals(getMyAppointment.size(), 1);
        assertEquals(getMyAppointment.get(0).getAppointmentId(),result.get(0).getAppointmentId());
        assertEquals(getMyAppointment.get(0).getDate(),result.get(0).getDate());
        assertEquals(getMyAppointment.get(0).getPatientName(),result.get(0).getPatientName());
        assertEquals(getMyAppointment.get(0).getDoctorName(),result.get(0).getDoctorName());
        assertEquals(getMyAppointment.get(0).getPrescription().getDescription(),result.get(0).getPrescription().getDescription());
    }
    @Test
    public void TestSaveAppointment() {
        Appointment savePatientAppointment=new Appointment();
        savePatientAppointment.setAppointmentId("a03");
        savePatientAppointment.setDate("11 august");
        savePatientAppointment.setDoctorName("doc04");
        savePatientAppointment.setPatientName("pat04");
        when(appointmentRepository.save(any(Appointment.class))).thenReturn(savePatientAppointment);
        Appointment result = patientController.saveAppointment(appointment);
        assertEquals(savePatientAppointment.getAppointmentId(), result.getAppointmentId());
        assertEquals(savePatientAppointment.getDate(), result.getDate());
        assertEquals(savePatientAppointment.getDoctorName(),result.getDoctorName());
        assertEquals(savePatientAppointment.getPatientName(), result.getPatientName());

    }

}
