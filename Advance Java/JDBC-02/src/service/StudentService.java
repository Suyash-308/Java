package service;

import dao.StudentDao;
import model.Student;

import java.sql.SQLException;
import java.util.List;

public class StudentService {

    StudentDao studentDao=new StudentDao();

    public void createStudent(Student student) throws SQLException {
        studentDao.createStudent(student);
    }

    public void deleteById(int id) throws SQLException {
        studentDao.deleteById(id);
    }

    public void getById(int id) throws SQLException{
        studentDao.getById(id);
    }

    public void updateStudent(Student student){
        studentDao.updateStudent(student);
    }

    public List<Student> getAllStudent(){
      return   studentDao.getAllStudent();
    }
}
