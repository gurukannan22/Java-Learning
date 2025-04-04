package com.myspringapplication.leo.controller;

import com.myspringapplication.leo.model.Student;
import com.myspringapplication.leo.model.StudentResponse;
import com.myspringapplication.leo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("api/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("add")
    public StudentResponse addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    @GetMapping("fetch")
    public List<Student> fetchAllStudents(){
        return studentService.getAllStudents();
    }

}
