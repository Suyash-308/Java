import controller.StudentController;
import model.Student;

import java.sql.SQLException;

public class StudentApp {
    public static void main(String[] args) throws SQLException {
        StudentController studentController=new StudentController();

        Student student=new Student();
        student.setId(3);
        student.setName("Suyash");
        student.setPhone("7589403");

//        studentController.createStudent(student);
//        studentController.deleteByID(2);
        studentController.getById(1);
    }
}
