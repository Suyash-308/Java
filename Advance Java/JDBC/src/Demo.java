import java.sql.*;

public class Demo {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","Root@123");

        Statement statement=connection.createStatement();

        ResultSet resultSet=statement.executeQuery("select * from  job");
        while (resultSet.next()){
            System.out.println("id :"+resultSet.getInt("id")+ "\n"+ "title :"+resultSet.getString("job_title"));
        }

        connection.close();

    }
}
