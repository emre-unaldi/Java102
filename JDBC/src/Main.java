import java.sql.*;

public class Main {
    public static final String DB_URL = "jdbc:mysql://localhost/university";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "";

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;

        String readSql = "SELECT * FROM student";
        String insertSql = "INSERT INTO student (student_name, student_class) VALUES ('Selman Can', 1)";
        String insertPreSql = "INSERT INTO student (student_name, student_class) VALUES (?, ?)";
        String updateSql = "UPDATE student SET student_class = 2, student_name = 'EMRE' WHERE student_id = 1";
        String deleteSql = "DELETE FROM student WHERE student_id = 16";

        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            statement = connection.createStatement();


            PreparedStatement preparedStatement = connection.prepareStatement(insertPreSql);
            preparedStatement.setString(1, "Ahmet");
            preparedStatement.setInt(2, 6);
            preparedStatement.executeUpdate();

            System.out.println("Kayýt Eklendi Mi ? " + statement.executeUpdate(insertSql));
            System.out.println("Kayýt Güncellendi Mi ? " + statement.executeUpdate(updateSql));
            System.out.println("Kayýt Silindi Mi ? " + statement.executeUpdate(deleteSql));


            ResultSet data = statement.executeQuery(readSql);
            while (data.next()) {
                System.out.println("Id : " + data.getInt("student_id"));
                System.out.println("Ad : " + data.getString("student_name"));
                System.out.println("Sýnýf : " + data.getInt("student_class"));
                System.out.println("**********************");
            }

            statement.close();
            connection.close();
            preparedStatement.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
