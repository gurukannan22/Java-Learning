package com.myspringapplication.leo.repository;

import com.myspringapplication.leo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class StudentDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public boolean isIdExists(int studentId){
        String searchQuery = "SELECT COUNT(*) FROM student_details WHERE student_id = ?";
        Integer count = jdbcTemplate.queryForObject(searchQuery,Integer.class,studentId); // 20th line
        return count != null && count > 0;
    }

    public String getFirstNameById(int studentId) {
        String sql = "SELECT first_name FROM student_details WHERE student_id = ?";
        return jdbcTemplate.queryForObject(sql, String.class, studentId);
    }

    public void saveStudent(Student student) {
        String sql = "INSERT INTO student_details (student_id, first_name, last_name, age, grade) VALUES (?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql,
                student.getStudentId(),
                student.getFirstName(),
                student.getLastName(),
                student.getAge(),
                student.getGrade());
    }

    public List<Student> findAll() {
        String findAllQuery = "SELECT * FROM student_details";
        return jdbcTemplate.query(findAllQuery, (rs, rowNumber) -> mapStudent(rs));
    }

    private Student mapStudent(ResultSet rs) throws SQLException {
        Student s = new Student();
        s.setStudentId(rs.getInt("student_id"));
        s.setFirstName(rs.getString("first_name"));
        s.setLastName(rs.getString("last_name"));
        s.setAge(rs.getInt("age"));
        s.setGrade(rs.getString("grade"));
        return s;
    }

}
