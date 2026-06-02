
import java.sql.*;

public class CRUDOperations {

    public static void create(Connection con) throws Exception {
        PreparedStatement ps =
            con.prepareStatement("INSERT INTO employee(name) VALUES(?)");
        ps.setString(1,"John");
        ps.executeUpdate();
    }

    public static void read(Connection con) throws Exception {
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM employee");
        while(rs.next()) {
            System.out.println(rs.getString("name"));
        }
    }

    public static void update(Connection con) throws Exception {
        PreparedStatement ps =
            con.prepareStatement("UPDATE employee SET name=? WHERE id=?");
        ps.setString(1,"Updated");
        ps.setInt(2,1);
        ps.executeUpdate();
    }

    public static void delete(Connection con) throws Exception {
        PreparedStatement ps =
            con.prepareStatement("DELETE FROM employee WHERE id=?");
        ps.setInt(1,1);
        ps.executeUpdate();
    }
}
