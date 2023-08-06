import java.sql.*;

public class TransactionClass {
    public static final String DB_URL = "jdbc:mysql://localhost/university";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "";

    public static void main(String[] args) {
        Connection connection = null;

        String insertPreSql = "INSERT INTO student (student_name, student_class) VALUES (?, ?)";

        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            connection.setAutoCommit(false);

            PreparedStatement preparedStatement = connection.prepareStatement(insertPreSql);
            preparedStatement.setString(1, "John");
            preparedStatement.setInt(2, 1);
            preparedStatement.executeUpdate();

            if (true) {
                throw new SQLException();
            }

            preparedStatement.setString(1, "Doe");
            preparedStatement.setInt(2, 3);
            preparedStatement.executeUpdate();

            connection.commit();
            preparedStatement.close();
        } catch (Exception e) {
            if (connection != null) {
                try {
                    connection.rollback();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
            System.out.println(e.getMessage());
        }
    }
}
