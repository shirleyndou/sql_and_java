import java.sql.*;

import static java.lang.System.*;

public class CustomerDB {
    private static final String USERNAME = "postgres"; //db username
    private static final String PASSWORD = "password"; //db password
    private static final String CONN_STRING = "jdbc:postgresql://localhost:5432/Umuzi"; //db URL

    /*
    * A method to select everything from the Customers table
    * */
    public void sqlQuery() {
        try {
            Connection con = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD); //connection string to connect to the db
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM Customers"); //query statement
            ResultSet rs = stmt.executeQuery(); //executes the result of the query

            while (rs.next()) {
                out.println(rs.getInt(1) + " | " + rs.getString(2) + " | " + rs.getString(3) + " | " +
                        rs.getString(4) + " | " + rs.getString(5) + " | " + rs.getString(6) + " | " + rs.getString(8) + " | " + rs.getString(9));
            }
        } catch (SQLException e) {
            //noinspection ThrowablePrintedToSystemOut
            err.println(e);
        }

    }

    /*
    * A method to Select the FirstName from the Customers table
    * */
    public void sqlQuery2() {
        try {
            Connection con = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            PreparedStatement stmt = con.prepareStatement("SELECT FirstName FROM Customers");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                out.println(rs.getString(1));
            }

        } catch (Exception e) {
            //noinspection ThrowablePrintedToSystemOut
            out.println(e);
        }
    }

    /*
    * A method to SElect the firstname from the Customers table where the ID is 1
    * */
    public void sqlQuery3() {
        try {
            Connection con = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            PreparedStatement stmt = con.prepareStatement("SELECT FirstName FROM Customers WHERE CustomerID =1");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                out.println(rs.getString(1));
            }

        } catch (Exception e) {
            //noinspection ThrowablePrintedToSystemOut
            out.println(e);
        }

    }

    /*
    * A method to update the firstname in the Customers table
    * */
    public void sqlQuery4() {
        try {
            Connection con = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            PreparedStatement stmt = con.prepareStatement("UPDATE Customers SET FirstName = 'Lerato' WHERE CustomerID = 1");
            ResultSet rs = stmt.executeQuery();

            out.println(rs);
            while (rs.next()) {
                out.println(rs.getString(1));
            }

        } catch (Exception e) {
            //noinspection ThrowablePrintedToSystemOut
            err.println(e);
        }

    }

    /*
    * A method to delete from the Customers table where the ID is 2
    * */
    public void sqlQuery5(){
        try{
            Connection con = DriverManager.getConnection(CONN_STRING, USERNAME,PASSWORD);
            PreparedStatement stmt = con.prepareStatement(" DELETE FROM Customers WHERE CustomerID = 2");
            ResultSet rs = stmt.executeQuery();
            out.println(rs);

        } catch (Exception e) {
            err.println(e);
        }
    }
}
