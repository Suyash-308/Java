package dao;

import model.Student;
import util.ConnectionUtil;
import java.sql.*;

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

    public void deleteById(int id) throws SQLException {
        Connection connection = ConnectionUtil.getConnection();

        String query = "delete from student where id=?";

        PreparedStatement preparedStatement=connection.prepareStatement(query);
        preparedStatement.setInt(1,id);
        preparedStatement.executeUpdate();

        connection.close();
        System.out.println(" successful");

    }

    public void getById(int id) throws SQLException {
        Connection connection=ConnectionUtil.getConnection();

        String query="select * from student where id=?";
        PreparedStatement preparedStatement=connection.prepareStatement(query);

        preparedStatement.setInt(1,id);
        preparedStatement.executeQuery();

        ResultSet resultSet=preparedStatement.getResultSet();
        while (resultSet.next()){
        System.out.println(resultSet.getInt("Id")+" "+resultSet.getString("Name")+" "+resultSet.getString("Phone"));
        }

        connection.close();


    }

}