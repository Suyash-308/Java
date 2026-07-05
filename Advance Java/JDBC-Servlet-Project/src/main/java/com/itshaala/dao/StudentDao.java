package com.itshaala.dao;

import com.itshaala.model.Student;
import com.itshaala.util.ConnectinUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
    public void createStudent(Student student) {
        String query="insert into student(name,phone)values(?,?)";
        Connection connection= ConnectinUtil.getConnection();
        PreparedStatement preparedStatement= null;
        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,student.getName());
            preparedStatement.setString(2,student.getPhone());
            preparedStatement.executeUpdate();
            connection.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void updateStudent(Student student) {
        String query="update student set name=?,phone=? where id=?";
        Connection connection= ConnectinUtil.getConnection();
        PreparedStatement preparedStatement= null;
        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,student.getName());
            preparedStatement.setString(2,student.getPhone());
            preparedStatement.setInt(3,student.getId());
            preparedStatement.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void deleteStudent(int id) {
        String query="delete from student where id=?";
        Connection connection= ConnectinUtil.getConnection();
        PreparedStatement preparedStatement= null;
        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,id);
            preparedStatement.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Student getStudentById(int id) {
        String query="select * from student where id=?";
        Connection connection= ConnectinUtil.getConnection();
        PreparedStatement preparedStatement= null;
        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,id);
            ResultSet resultSet =preparedStatement.executeQuery();
            Student student=new Student();
            while (resultSet.next()){
                student.setId(resultSet.getInt("id"));
                student.setName(resultSet.getString("name"));
                student.setName(resultSet.getString("phone"));
            }
            connection.close();
            return student;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public List<Student> getAllStudent() {
        List<Student>list=new ArrayList<>();
        String query="select * from student";
        Connection connection= ConnectinUtil.getConnection();
        Statement statement= null;
        try {
            statement = connection.createStatement();
            ResultSet resultSet =statement.executeQuery(query);

            while (resultSet.next()){
                Student student=new Student();
                student.setId(resultSet.getInt("id"));
                student.setName(resultSet.getString("name"));
                student.setName(resultSet.getString("phone"));
                list.add(student);
            }
            connection.close();
            return  list;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

}
