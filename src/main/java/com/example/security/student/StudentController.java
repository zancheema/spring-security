package com.example.security.student;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    private static final List<Student> STUDENTS = List.of(
        new Student(1, "James Bond"),
        new Student(2, "Maria Bond"),
        new Student(3, "Anna Smith")
    );
    
    @GetMapping("/{studentId}")
    public Student getStudent(@PathVariable(name = "studentId") Integer studentId) {
        return STUDENTS.stream()
            .filter(s -> studentId.equals(s.getStudentId()))
            .findFirst()
            .orElseThrow(() -> new IllegalStateException("Student " + studentId + " does not exist."));
    }
}
