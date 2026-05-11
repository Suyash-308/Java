import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoInsert {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName(ConstantDemo.MYSQL_DRIVER_CLASS);

        Connection connection= DriverManager.getConnection(ConstantDemo.MYSQL_URL,ConstantDemo.MYSQL_USERNAME,ConstantDemo.MYSQL_PASSWORD);

        Statement statement=connection.createStatement();
        String query="insert into college(Id,Name,Phone)values(1,'Suyash','123456784')";

        statement.executeUpdate(query);
        connection.close();

        System.out.println("Insert Data Successful");


    }
}
