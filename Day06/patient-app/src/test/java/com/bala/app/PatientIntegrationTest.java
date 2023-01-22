package com.bala.app;

import com.bala.app.controller.PatientController;
import com.bala.app.service.PatientService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@WebMvcTest({PatientController.class})
public class PatientIntegrationTest {
    @Autowired
    PatientService patientService;

}
