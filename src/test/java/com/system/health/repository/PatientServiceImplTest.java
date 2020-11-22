package com.system.health.repository;


import com.system.health.models.Patient;
import com.system.health.repositories.PatientRepository;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;


@RunWith(SpringRunner.class)
@SpringBootTest
public class PatientServiceImplTest {

    @Mock
    PatientRepository patientRepository;

    @BeforeEach
    void setUp() throws Exception{
    }

    @Test
    final void testGeTPatient() {
        Patient patient = new Patient();
        patient.setPatientId(49507260169L);
        patient.setPatientName("Katazyna");
        patient.setPatientSurname("Savicka");
        patient.setPatientEmail("katarzynasav@gmail.com");


    }



}
