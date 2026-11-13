package com.intuit.hello_world.service;

import com.intuit.hello_world.entity.Student;
import com.intuit.hello_world.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    public String saveStudent(Student student) {
        studentRepository.save(student);
        return "Student inserted successfully";
    }
}
