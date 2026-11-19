package com.intuit.hello_world.controller;

import com.intuit.hello_world.dto.APIResponse;
import com.intuit.hello_world.dto.StudentDTO;
import com.intuit.hello_world.entity.Student;
import com.intuit.hello_world.service.StudentService;
import jakarta.persistence.PersistenceUnitTransactionType;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.function.ToDoubleBiFunction;

@RestController
@RequestMapping("/student")
public class StudentController {
   @Autowired
    private StudentService studentService;

@PostMapping("/insert")
public ResponseEntity<APIResponse<StudentDTO>> saveStudent(@RequestBody @Valid StudentDTO student) {

    APIResponse <StudentDTO> response = new APIResponse<>(200, "Student saved successfully", studentService.saveStudent(student),null);
    return ResponseEntity.ok(response);
}

@GetMapping("/get/{id}")
public ResponseEntity<APIResponse<StudentDTO>> getStudentById(@PathVariable Long id) {
    StudentDTO studentDTO = studentService.getStudentById(id);
    return ResponseEntity.ok(new APIResponse<>(200, "Student retrieved successfully", studentDTO, null));
}

}
