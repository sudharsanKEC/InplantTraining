
import java.sql.*;

public class Transactions {
    public static void main(String[] args) throws Exception {

        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/company","root","password");

        try {
            con.setAutoCommit(false);

            Statement st = con.createStatement();
            st.executeUpdate("UPDATE account SET balance=balance-100 WHERE id=1");
            st.executeUpdate("UPDATE account SET balance=balance+100 WHERE id=2");

            con.commit();
            System.out.println("Transaction Success");

        } catch(Exception e) {
            con.rollback();
            System.out.println("Rolled Back");
        }

        con.close();
    }
}
