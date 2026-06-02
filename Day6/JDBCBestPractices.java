
/*
JDBC Best Practices

1. Use PreparedStatement instead of Statement.
2. Close resources using try-with-resources.
3. Avoid hardcoded credentials.
4. Use connection pooling (HikariCP).
5. Use transactions where required.
6. Handle exceptions properly.
7. Store SQL separately for large projects.
8. Follow DAO pattern.
9. Validate user inputs.
10. Monitor slow queries.

Typical Architecture:

Controller
   |
Service
   |
DAO
   |
JDBC
   |
Database
*/

public class JDBCBestPractices {
    public static void main(String[] args) {
        System.out.println("Follow JDBC Best Practices");
    }
}
