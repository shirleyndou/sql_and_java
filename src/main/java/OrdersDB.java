import java.sql.*;

public class OrdersDB {
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "password";
    private static final String CONN_STRING = "jdbc:postgresql://localhost:5432/Umuzi";

    public void sqlQueryO() {
        try {
            Connection con = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            PreparedStatement stmt = con.prepareStatement("SELECT COUNT (DISTINCT Status) FROM \"information\".Orders");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getString(1));
            }
        } catch (SQLException e) {
            //noinspection ThrowablePrintedToSystemOut
            System.err.println(e);
        }
    }
}
