package controller;

import dao.StudentDao;
import model.Student;
import service.StudentService;

import java.sql.SQLException;

public class StudentController {
    StudentService studentService=new StudentService();

    public void createStudent(Student student) throws SQLException {
        studentService.createStudent(student);
    }
}
