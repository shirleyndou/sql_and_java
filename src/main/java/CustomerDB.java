import java.sql.*;

public class CustomerDB {
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "password";
    private static final String CONN_STRING = "jdbc:postgresql://localhost:5432/Umuzi";

    public void sqlQuery() {
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

    public void sqlQuery2() {
        try {
            Connection con = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            PreparedStatement stmt = con.prepareStatement("SELECT FirstName FROM Customers");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getString(1));
            }

        } catch (Exception e) {
            //noinspection ThrowablePrintedToSystemOut
            System.out.println(e);
        }
    }

    public void sqlQuery3() {
        try {
            Connection con = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            PreparedStatement stmt = con.prepareStatement("SELECT FirstName FROM Customers WHERE CustomerID =1");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getString(1));
            }

        } catch (Exception e) {
            //noinspection ThrowablePrintedToSystemOut
            System.out.println(e);
        }

    }

    public void sqlQuery4() {
        try {
            Connection con = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            PreparedStatement stmt = con.prepareStatement("UPDATE Customers SET FirstName = 'Lerato' WHERE CustomerID = 1");
            ResultSet rs = stmt.executeQuery();

            System.out.println(rs);
            while (rs.next()) {
                System.out.println(rs.getString(1));
            }

        } catch (Exception e) {
            //noinspection ThrowablePrintedToSystemOut
            System.err.println(e);
        }

    }

    public void sqlQuery5(){
        try{
            Connection con = DriverManager.getConnection(CONN_STRING, USERNAME,PASSWORD);
            PreparedStatement stmt = con.prepareStatement(" DELETE FROM Customers WHERE CustomerID = 2");
            ResultSet rs = stmt.executeQuery();
            System.out.println(rs);

        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
