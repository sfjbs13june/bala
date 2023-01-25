package com.bala.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

public class StudentControllerTest {

    StudentController studentController = new StudentController();

    @Test
    public void testGetStudents() {

        int expectedSize = 3;

        List result = studentController.getStudents();
        Assertions.assertEquals(expectedSize,result.size());

    }

    @Test
    public void testMapStudents() {

        int expectedSize = 1;

        Map result = studentController.mapStudents();
        Assertions.assertEquals(expectedSize,result.size());

    }

}
