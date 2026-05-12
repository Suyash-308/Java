package dao;

import model.Student;
import util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDao {

    public void createStudent(Student student) throws SQLException {
        Connection connection = ConnectionUtil.getConnection();

        String query = "insert into student (Id,Name,Phone) values(?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);


        preparedStatement.setInt(1, student.getId());
        preparedStatement.setString(2, student.getName());
        preparedStatement.setString(3, student.getPhone ());
        preparedStatement.executeUpdate();

        connection.close();
        System.out.println("Inserted successfully");

    }
}