package com.myspringapplication.leo.model;


import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class StudentResponse {
    private String status;
    private String message;
}
