import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC{
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/student_db";
        String username = "root";
        String password = "2005";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            if(conn != null){
                System.out.println("Connected to the DB successfully: "+conn);
            }
            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM students");

            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name1");
                String dept = rs.getString("dept");
                int age = rs.getInt("age");

                System.out.println(id + " | " + name + " | " + dept + " | " + age);
            }

            rs.close();
            stmt.close();
            conn.close();

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
