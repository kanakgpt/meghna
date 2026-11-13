package com.intuit.hello_world.controller;

import com.intuit.hello_world.entity.Student;
import com.intuit.hello_world.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
   @Autowired
    private StudentService studentService;

@PostMapping("/insert")
public ResponseEntity<String> saveStudent(@RequestBody Student student) {
    studentService.saveStudent(student);
    return ResponseEntity.ok("Student inserted successfully");
}


}
