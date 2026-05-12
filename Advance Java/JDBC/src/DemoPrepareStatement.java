import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DemoPrepareStatement {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName(ConstantDemo.MYSQL_DRIVER_CLASS);

        Connection connection= DriverManager.getConnection(ConstantDemo.MYSQL_URL,ConstantDemo.MYSQL_USERNAME, ConstantDemo.MYSQL_PASSWORD);

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Id,Name,Phone");
        int Id=scanner.nextInt();
        String Name=scanner.next();
        String Phone= scanner.next();

        String query="insert into college (Id,Name,Phone)values(?,?,?)";

        PreparedStatement preparedStatement=connection.prepareStatement(query);
        preparedStatement.setInt(1,Id);
        preparedStatement.setString(2,Name);
        preparedStatement.setString(3,Phone);

        preparedStatement.executeUpdate();

        connection.close();
        System.out.println("Successful");



    }
}
