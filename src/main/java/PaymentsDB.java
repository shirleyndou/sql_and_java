import java.sql.*;

public class PaymentsDB {
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "password";
    private static final String CONN_STRING = "jdbc:postgresql://localhost:5432/Umuzi";

    /*
    * A method to calculate the Maximum amount in the Payments table
    * */
    public void sqlQuery7() {
        try {
            Connection con = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD); //connection string to the database
            PreparedStatement stmt = con.prepareStatement("SELECT MAX(Amount) FROM \"information\".Payments"); //sql query statement
            ResultSet rs = stmt.executeQuery(); //executes the result of the query

            while (rs.next()) {
                System.out.println(rs.getString(1));
            }
        } catch (SQLException e) {
            //noinspection ThrowablePrintedToSystemOut
            System.err.println(e);
        }
    }
}
