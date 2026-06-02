
import java.io.*;
import java.sql.*;
import jakarta.servlet.http.*;

public class ServletJDBCIntegration extends HttpServlet {

    protected void doGet(HttpServletRequest req,
                         HttpServletResponse res)
                         throws IOException {

        try {

            Connection con =
                DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/company",
                    "root",
                    "password");

            Statement st =
                con.createStatement();

            ResultSet rs =
                st.executeQuery("SELECT * FROM employee");

            PrintWriter out = res.getWriter();

            while(rs.next()) {
                out.println(rs.getString("name"));
            }

            con.close();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
