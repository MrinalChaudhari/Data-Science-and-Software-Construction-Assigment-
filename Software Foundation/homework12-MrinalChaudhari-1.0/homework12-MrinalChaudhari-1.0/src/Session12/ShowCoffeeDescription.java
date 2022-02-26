package Session12;
import java.sql.*;

public class ShowCoffeeDescription {

    public static void main(String[] args) {
        // Database connection
        final String url = "jdbc:mysql://localhost:3306/Coffee";
        final String user = "root";
        final String password = "";
        try
        {
            Connection conn = DriverManager.getConnection(url, user, password);

            Statement stmt=conn.createStatement();
            //String sqlstatement= "SELECT * FROM Coffee";
            String sqlstatement= "SELECT Description from Coffee";
                    ResultSet result= stmt.executeQuery(sqlstatement);

            System.out.println("Coffee found in the db");

            while (result.next())
            {
                System.out.println(result.getString("Description"));
                System.out.println("Description: " +result.getString(1)+ "ID: " +result.getString(2));
            }

        }catch(Exception ex)
        {
            System.out.println("ERROR: " + ex.getMessage());
        }

    }
}
