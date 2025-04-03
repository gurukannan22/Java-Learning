package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyConnection {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/student",
                "root","");

        Statement stmt = connection.createStatement();
        stmt.execute("SELECT * FROM student_details");
        ResultSet resultSet = stmt.getResultSet();
        while(resultSet.next()){
           int studentId = resultSet.getInt("student_id");
           String studentFirstName = resultSet.getString("first_name");
            System.out.println(studentId + " -> " +studentFirstName);
        }
    }
}