package com.myspringapplication.leo.service;

import com.myspringapplication.leo.model.Student;
import com.myspringapplication.leo.model.StudentResponse;
import com.myspringapplication.leo.repository.StudentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentDAO studentDAO;

    @Autowired
    private StudentResponse studentResponse;

    public StudentResponse addStudent(Student student){
        if(studentDAO.isIdExists(student.getStudentId())){
            String existingName = studentDAO.getFirstNameById(student.getStudentId());
            studentResponse.setStatus("Failed");
            studentResponse.setMessage("The Student ID (" + student.getStudentId() + ") you entered belongs to (" +
                    existingName + "), Please enter a unique ID.");
            return studentResponse;
        }

        studentDAO.saveStudent(student);
        studentResponse.setStatus("Success");
        studentResponse.setMessage("✅ Student added successfully!");

        return studentResponse;
    }

    public List<Student> getAllStudents() {
        return studentDAO.findAll();
    }

}
