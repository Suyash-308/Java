import controller.StudentController;
import model.Student;

import java.sql.SQLException;
import java.util.List;

public class StudentApp {
    public static void main(String[] args) throws SQLException {
        StudentController studentController=new StudentController();

        Student student=new Student();
        student.setId(3);
        student.setName("Suyash");
        student.setPhone("8909403");

//        studentController.createStudent(student);
//        studentController.deleteByID(2);
//        studentController.getById(1);
//        studentController.updateStudent(student);
        studentController.getAllStudent().forEach(System.out::println);

    }
}
