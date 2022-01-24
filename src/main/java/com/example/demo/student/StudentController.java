package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public void registerNewStudent(@RequestBody Student student) {
        studentServise.addNewStudent(student);
    }

    @DeleteMapping(path = "{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long studentId) {
        studentServise.deleteStudent(studentId);
    }

    @PutMapping(path = "{studentId}")
    public void updateStudent(
            @PathVariable("studentId") Long studentId,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String email) {
        studentServise.updateStudent(studentId, name, email);
    }
}

