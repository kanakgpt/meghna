package com.intuit.hello_world.repository;

import com.intuit.hello_world.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
