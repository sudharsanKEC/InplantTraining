
import java.sql.*;

public class StatementExample {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/company","root","password");

        Statement st = con.createStatement();

        String sql = "SELECT * FROM employee";
        ResultSet rs = st.executeQuery(sql);

        while(rs.next()){
            System.out.println(rs.getInt("id") + " " +
                               rs.getString("name"));
        }

        rs.close();
        st.close();
        con.close();
    }
}
