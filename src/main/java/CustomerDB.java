import java.sql.*;

public class CustomerDB {
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "password";
    private static final String CONN_STRING = "jdbc:postgresql://localhost:5432/Umuzi";

    public void sqlQuery(){
        try {
            Connection con = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM Customers");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getInt(1) + " | " + rs.getString(2) + " | " + rs.getString(3) + " | " +
                        rs.getString(4) + " | " + rs.getString(5) + " | " + rs.getString(6) + " | " + rs.getString(8) + " | " + rs.getString(9));
            }
        } catch (SQLException e) {
            //noinspection ThrowablePrintedToSystemOut
            System.err.println(e);
        }
    }

    public void firstNameSQL(){
        try{
            Connection con = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            PreparedStatement stmt = con.prepareStatement("SELECT FirstName FROM Customers");
            ResultSet rs = stmt.executeQuery();

            while(rs.next()){
                System.out.println(rs.getString(1));
            }

        } catch (Exception e) {
            //noinspection ThrowablePrintedToSystemOut
            System.out.println(e);
        }
    }

}
