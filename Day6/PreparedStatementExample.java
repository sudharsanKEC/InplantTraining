
import java.sql.*;

public class PreparedStatementExample {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/company","root","password");

        String sql = "INSERT INTO employee(name,salary) VALUES (?,?)";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, "Sudharsan");
        ps.setDouble(2, 50000);

        int rows = ps.executeUpdate();

        System.out.println("Rows inserted: " + rows);

        ps.close();
        con.close();
    }
}
