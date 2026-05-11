import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoUpdate {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName(ConstantDemo.MYSQL_DRIVER_CLASS);

        Connection connection= DriverManager.getConnection(ConstantDemo.MYSQL_URL,ConstantDemo.MYSQL_USERNAME,ConstantDemo.MYSQL_PASSWORD);

        Statement statement=connection.createStatement();
        String query="update college set Name='Ravan' where id=1";

        statement.executeUpdate(query);

        connection.close();
        System.out.println("Successful");
    }
}
