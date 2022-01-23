package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    private final StudentServise studentServise;

    @Autowired
    public StudentController(StudentServise studentServise) {
        this.studentServise = studentServise;
    }

    @GetMapping
    public List<Student> getStudents() {
return studentServise.getStudents();
    }
}
