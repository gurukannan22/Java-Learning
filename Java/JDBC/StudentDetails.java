package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Connection connection = null;
        try {

            connection = MyJDBCConnection.getConnection();

            while (true) {
                System.out.println("Enter the Option:\n (1) View All Students \n (2) Add new Student");
                int option = scanner.nextInt();


                switch(option){
                    case 1:
                        printAllStudents(connection);
                        break;
                    case 2:
                        System.out.print("Enter Student ID: ");
                        int studentId = scanner.nextInt();
                        scanner.nextLine();

                        String existingStudentName = getStudentNameById(connection, studentId);
                        if (existingStudentName != null) {
                            System.out.println("ERROR: Student ID (" + studentId + ") you entered is belongs to (" + existingStudentName +
                                    ") please enter a unique ID");
                            continue;
                        }

                        System.out.print("Enter First Name: ");
                        String firstName = scanner.nextLine();

                        System.out.print("Enter Last Name: ");
                        String lastName = scanner.nextLine();

                        System.out.print("Enter Age: ");
                        int age = scanner.nextInt();
                        scanner.nextLine(); // Consume newline

                        System.out.print("Enter Grade: ");
                        String grade = scanner.nextLine();

                        insertStudent(connection, studentId, firstName, lastName, age, grade);
                        System.out.println("Student Details Stored Successfully");
                        break;
                }

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) connection.close();
                scanner.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private static void printAllStudents(Connection connection) throws SQLException {
        String query = "SELECT * FROM student_details";
        try (PreparedStatement pstmt = connection.prepareStatement(query);
             ResultSet rs = pstmt.executeQuery()) {

            System.out.println("\n--- Student Details ---");
            System.out.printf("%-10s %-15s %-15s %-5s %-10s%n", "ID", "First Name", "Last Name", "Age", "Grade");
            System.out.println("------------------------------------------------------");

            while (rs.next()) {
                int studentId = rs.getInt("student_id");
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                int age = rs.getInt("age");
                String grade = rs.getString("grade");

                System.out.printf("%-10d %-15s %-15s %-5d %-10s%n", studentId, firstName, lastName, age, grade);
            }
        }
    }


    private static String getStudentNameById(Connection connection, int studentId) throws SQLException {
        String query = "SELECT first_name FROM student_details WHERE student_id = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setInt(1, studentId);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return rs.getString("first_name");
            }
        }
        return null;
    }

    private static void insertStudent(Connection connection, int studentId, String firstName, String lastName, int age, String grade) throws SQLException{
        String insertQuery = "INSERT INTO student_details (student_id, first_name, last_name, age, grade) VALUES (?,?,?,?,?)";
        try(PreparedStatement pstmt = connection.prepareStatement(insertQuery)){
            pstmt.setInt(1,studentId);
            pstmt.setString(2,firstName);
            pstmt.setString(3,lastName);
            pstmt.setInt(4,age);
            pstmt.setString(5,grade);
            pstmt.executeUpdate();
        }
    }

}
