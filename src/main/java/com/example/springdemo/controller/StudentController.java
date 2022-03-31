package com.example.springdemo.controller;

import com.example.springdemo.model.Student;
import com.example.springdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping(value = "/get-all-students", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @PostMapping("/student")
    private int saveStudent(@RequestBody Student student) {
        studentService.saveOrUpdate(student);
        return student.getId();
    }

    @DeleteMapping("/student/{id}")
    private String deleteStudent(@PathVariable("id") int id) {
        studentService.delete(id);
        return "Deleted by id";
    }

    @PutMapping("/student/{id}")
    private Student update(@RequestBody Student student,@PathVariable("id") int id){
        studentService.update(student, id);
        return student;
    }

}
