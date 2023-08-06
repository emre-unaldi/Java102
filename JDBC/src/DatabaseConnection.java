import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    public static void main(String[] args) {
        Connection connection = null;
        String dbUrl = "jdbc:mysql://localhost:3306/university?user=root";

        try {
            connection = DriverManager.getConnection(dbUrl);
            System.out.println(connection);
            System.out.println("Baðlantý Baþarýlý !");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
