package com.intuit.hello_world.service;

import com.intuit.hello_world.dto.StudentDTO;
import com.intuit.hello_world.entity.Student;
import com.intuit.hello_world.mapper.StudentMapper;
import com.intuit.hello_world.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public StudentDTO saveStudent(StudentDTO studentDTO) {
        Student student = StudentMapper.toEntity(studentDTO);
        Student studentEntity = studentRepository.save(student);
        return StudentMapper.toDTO(studentEntity);

    }

    public StudentDTO getStudentById(Long id) {
        Student student = studentRepository.findById(id).orElse(null);
        return StudentMapper.toDTO(student);


    }
}
