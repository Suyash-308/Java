package com.itshaala.service;

import com.itshaala.dao.StudentDao;
import com.itshaala.model.Student;
import com.itshaala.util.ConnectinUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentService {
    StudentDao studentDao=new StudentDao();

    public void createStudent(Student student) throws SQLException {
       studentDao.createStudent(student);
    }

    public void updateStudent(Student student) throws SQLException {
       studentDao.updateStudent(student);
    }

    public void deleteStudent(int id) throws SQLException {
        studentDao.deleteStudent(id);
    }

    public Student getStudentById(int id) throws SQLException {

        return studentDao.getStudentById(id);
    }

    public List<Student> getAllStudent() throws SQLException {
        return  studentDao.getAllStudent();

    }

}
