import controller.StudentController;
import model.Student;

import java.sql.SQLException;

public class StudentApp {
    public static void main(String[] args) throws SQLException {
        StudentController studentController=new StudentController();

        Student student=new Student();
        student.setId(3);
        student.setName("Sachin");
        student.setPhone("45678");

        studentController.createStudent(student);
    }
}
