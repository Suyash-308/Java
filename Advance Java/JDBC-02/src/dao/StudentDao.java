package dao;

import lombok.SneakyThrows;
import model.Student;
import util.ConnectionUtil;

import javax.naming.Name;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    @SneakyThrows
    public void updateStudent(Student student){
        Connection connection=ConnectionUtil.getConnection();

        String query="update student set Name=?,Phone=? where id=?";
        PreparedStatement preparedStatement=connection.prepareStatement(query);
        preparedStatement.setString(1,student.getName());
        preparedStatement.setString(2,student.getPhone());
        preparedStatement.setInt(3,student.getId());

        preparedStatement.executeUpdate();
        connection.close();
        System.out.println("Successful");

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


@SneakyThrows
    public List<Student> getAllStudent(){

        List<Student> studentList=new ArrayList<>();

        Connection connection=ConnectionUtil.getConnection();

        String query="select * from student";
        Statement statement=connection.createStatement();
        ResultSet resultSet= statement.executeQuery(query);
        while (resultSet.next()){
            Student student1=new Student();
            student1.setId(resultSet.getInt("Id"));
            student1.setName(resultSet.getString("Name"));
            student1.setPhone(resultSet.getString("Phone"));
            studentList.add(student1);
        }

        connection.close();
        return studentList;

    }

}