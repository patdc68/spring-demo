package com.example.springdemo.service;

import com.example.springdemo.model.Student;
import com.example.springdemo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;


/*
*All the Business Logic
*goes here
*/

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public void saveOrUpdate(Student student) {
        studentRepository.save(student);
    }

    public void delete(int id){
        studentRepository.deleteById(id);
    }

    public void update(Student student, int id){
        student.setName("Patrick");
        studentRepository.save(student);
    }
}
