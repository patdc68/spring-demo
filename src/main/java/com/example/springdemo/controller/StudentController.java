package com.example.springdemo.controller;

import com.example.springdemo.model.Student;
import com.example.springdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping(value = "/get-all-students", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Student> getStudents(){
        return studentService.getStudents();
    }
}
