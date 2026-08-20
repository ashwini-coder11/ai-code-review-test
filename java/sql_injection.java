import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SqlInjectionDemo {
    public static void main(String[] args) throws Exception {
        String username = args[0];
        String query = "SELECT * FROM users WHERE username = '" + username + "'";
        Connection conn = DriverManager.getConnection("jdbc:h2:mem:test");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next()) {
            System.out.println(rs.getString("username"));
        }
    }
}

// This concatenates a user-controlled string directly into SQL.
