
import java.sql.*;

public class DatabaseConnection {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/company";
        String username = "root";
        String password = "password";

        Connection con = DriverManager.getConnection(url, username, password);

        System.out.println("Connected Successfully");
        con.close();
    }
}
