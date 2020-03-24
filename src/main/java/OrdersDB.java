import java.sql.*;

public class OrdersDB {
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "password";
    private static final String CONN_STRING = "jdbc:postgresql://localhost:5432/Umuzi";

    /*
    * A method to Count the number of Statuses in the Orders table
    * */
    public void sqlQuery6() {
        try {
            Connection con = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD); //connection string to connect to the db
            PreparedStatement stmt = con.prepareStatement("SELECT COUNT (DISTINCT Status) FROM \"information\".Orders"); //sql statement
            ResultSet rs = stmt.executeQuery(); //executes the results of the sql statement

            while (rs.next()) {
                System.out.println(rs.getString(1));
            }
        } catch (SQLException e) {
            //noinspection ThrowablePrintedToSystemOut
            System.err.println(e);
        }
    }
}
