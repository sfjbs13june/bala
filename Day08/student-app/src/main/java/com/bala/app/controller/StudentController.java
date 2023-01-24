package com.bala.app.controller;

import com.bala.app.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class StudentController {

    @GetMapping("/get/students")
    public List<Student> getStudents(){
        List listStudents= new ArrayList();
        Student  student1= new Student("sai", "1", "10", "xyz");
        Student  student2= new Student("sai", "1", "10", "xyz");
        Student  student3= new Student("sai", "1", "10", "xyz");

        listStudents.add(student1);
        listStudents.add(student2);
        listStudents.add(student3);
        return  listStudents;
    }

    @GetMapping("/map/students")
    public Map mapStudents(){
        Map studentMap= new HashMap();
        Student  student1= new Student("sai", "1", "10", "xyz");
        Student  student2= new Student("sai", "1", "10", "xyz");
        Student  student3= new Student("sai", "1", "10", "xyz");

        studentMap.put(student1.getName(),student1);
        studentMap.put(student2.getName(),student2);
        studentMap.put(student3.getName(),student3);
        return  studentMap;
    }
}
