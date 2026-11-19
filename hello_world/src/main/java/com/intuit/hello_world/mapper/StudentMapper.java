package com.intuit.hello_world.mapper;

import com.intuit.hello_world.dto.StudentDTO;
import com.intuit.hello_world.entity.Student;

public class StudentMapper {

    public static StudentDTO toDTO(Student student) {

        StudentDTO dto = new StudentDTO();
        dto.setName(student.getName());
        dto.setAge(student.getAge());
        dto.setCourse(student.getCourse());
        return dto;
    }
    public static Student toEntity(StudentDTO dto) {
        Student student = new Student();
        student.setName(dto.getName());
        student.setAge(dto.getAge());
        student.setCourse(dto.getCourse());
        return student;
    }

}
