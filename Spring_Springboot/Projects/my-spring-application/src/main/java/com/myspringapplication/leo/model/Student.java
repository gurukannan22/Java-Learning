package com.myspringapplication.leo.model;

import lombok.Data;

@Data
public class Student {
    private int studentId;
    private String firstName;
    private String lastName;
    private int age;
    private String grade;
}