import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoCreate {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName(ConstantDemo.MYSQL_DRIVER_CLASS);

        Connection connection= DriverManager.getConnection(ConstantDemo.MYSQL_URL,ConstantDemo.MYSQL_USERNAME,ConstantDemo.MYSQL_PASSWORD);

        Statement statement=connection.createStatement();
        String query="create table college(Id int primary key,Name varchar(100),Phone varchar(50))";

        statement.execute(query);

        connection.close();

        System.out.println("table created successfully");
    }
}
