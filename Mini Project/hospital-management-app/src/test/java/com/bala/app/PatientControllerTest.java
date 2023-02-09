package com.bala.app;

import com.bala.app.component.PatientController;
import com.bala.app.model.Appointment;
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
    public void Test1(){
        List test=new ArrayList();
        when(appointmentRepository.findByPatientName(anyString())).thenReturn(test);
        List result=patientController.getMyAppointments("xyz");
        assertEquals(test,result);
    }

    @Test
    public void Test2(){
        Appointment ap1=new Appointment();
        when(appointmentRepository.save(any(Appointment.class))).thenReturn(ap1);
        Appointment result=patientController.saveAppointment(appointment);
        assertEquals(ap1,result);
    }

}
