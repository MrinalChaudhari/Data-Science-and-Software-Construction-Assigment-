package Session12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class createCustomerTable {
    public static void main(String[] args) throws SQLException {
        // Database connection
        final String url = "jdbc:mysql://localhost:3306/Coffee";
        //final String user = "root";
        //final String password = "";
        try {
            Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement();

            String sql= "CREATE TABLE Customer" +
                    "(CustomerNumber CHAR(10) NOT NULL PRIMARY KEY, " +
                    " Name CHAR(25), " +
                    " Address CHAR(25) ," +
                    " City CHAR(12) ," +
                    " State CHAR(10)" +
                    " ZIP CHAR(5) )";

            stmt.execute(sql);

            sql= "INSERT INTO Customer VALUES" +
                    "('101', 'James','30.K street',"+
                    " 'rochester', 'newyork', '23656')";

            stmt.executeUpdate(sql);

            sql= "INSERT INTO Customer VALUES" +
                    "('102', 'Alex','rustic village street',"+
                    " 'monera county', 'NYC', '36565')";

            stmt.executeUpdate(sql);

            sql= "INSERT INTO Customer VALUES" +
                    "('103', 'Thomas','park point',"+
                    " 'main street', 'minnesota', '65695')";

            stmt.executeUpdate(sql);

            conn.close();

        } catch (Exception ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }
}
