
import java.sql.*;

public class ResultSetDeepDive {
    public static void main(String[] args) throws Exception {

        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/company","root","password");

        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery("SELECT * FROM employee");

        while(rs.next()) {
            int id = rs.getInt(1);
            String name = rs.getString(2);

            System.out.println(id + " " + name);
        }

        rs.close();
        st.close();
        con.close();
    }
}
