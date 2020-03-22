import java.sql.*;

public class Main {

    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "password";
    private static final String CONN_STRING = "jdbc:postgresql://localhost:5432/Umuzi";

    public static void main(String[] args) throws SQLException {

        try {
            Connection con = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM Customers");
            ResultSet rs = stmt.executeQuery();

        } catch (SQLException e) {
            System.out.println(e);;
        }
    }
}
