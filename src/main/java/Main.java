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

            while(rs.next()){
                System.out.println(rs.getInt(1) + " | " + rs.getString(2) + " | " + rs.getString(3) + " | " +
                        rs.getString(4) + " | " + rs.getString(5) + " | "  + rs.getString(6) + " | " + rs.getString(8)+ " | " + rs.getString(9));
            }

        } catch (SQLException e) {
            System.err.println(e);;
        }
    }
}
