
import java.sql.*;

public class BatchProcessing {
    public static void main(String[] args) throws Exception {

        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/company","root","password");

        Statement st = con.createStatement();

        st.addBatch("INSERT INTO employee(name) VALUES('A')");
        st.addBatch("INSERT INTO employee(name) VALUES('B')");
        st.addBatch("INSERT INTO employee(name) VALUES('C')");

        int[] result = st.executeBatch();

        System.out.println("Executed: " + result.length);

        st.close();
        con.close();
    }
}
