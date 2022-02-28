package com.example.securityexamplejwt.controller;

import com.example.securityexamplejwt.exceptions.StudentNotFoundException;
import com.example.securityexamplejwt.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/management/api/students")
public class ManagementController {

    private static List<Student> students = List.of(
            new Student(1, "Santhosh"),
            new Student(2, "Radhika"),
            new Student(3, "John"),
            new Student(4, "Zuber"),
            new Student(5, "Sudhakar")
    );

    @GetMapping({"", "/"})
    public List<Student> get() {
        return students;
    }


    @PostMapping
    public String registerNewStudent(@RequestBody Student student) {
        students.add(student);
        return "Created";
    }

    @DeleteMapping("/{id}")
    public String registerNewStudent(@PathVariable("id") Integer id) throws StudentNotFoundException {
        Student student = students.stream()
                .filter(std -> std.getId()
                        .equals(id))
                .findAny()
                .orElseThrow(() -> new StudentNotFoundException(id));
        students.remove(student);
        return "removed";
    }


}
