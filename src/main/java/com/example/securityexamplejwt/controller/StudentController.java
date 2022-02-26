package com.example.securityexamplejwt.controller;


import com.example.securityexamplejwt.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private static List<Student> students = List.of(
            new Student(1,"Santhosh"),
            new Student(2,"Radhika"),
            new Student(3, "John"),
            new Student(4, "Zuber"),
            new Student(5, "Sudhakar")
    );

    @GetMapping({"","/"})
    public List<Student> get(){
        return  students;
    }




}
