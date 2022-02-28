package com.example.securityexamplejwt.exceptions;

public class StudentNotFoundException extends Exception {

    private Integer id;


    public StudentNotFoundException(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "StudentNotFoundException{" +
                "id=" + id +
                '}';
    }
}
