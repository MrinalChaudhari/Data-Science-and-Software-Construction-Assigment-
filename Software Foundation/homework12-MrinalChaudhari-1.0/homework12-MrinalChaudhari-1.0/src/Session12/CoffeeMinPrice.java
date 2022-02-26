package Session12;
import java.sql.*;
import java.util.Scanner;

public class CoffeeMinPrice {

    public static void main(String[] args) throws SQLException {
        // Database connection
        final String url = "jdbc:mysql://localhost:3306/Coffee";
        final String user = "root";
        final String password = "";
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the minimum Price: ");
        double minPrice= input.nextDouble();

        try
        {
            Connection conn = DriverManager.getConnection(url, user, password);

            Statement stmt=conn.createStatement();
            //String sqlstatement= "SELECT * FROM Coffee";

            //String sqlstatement= "SELECT Description from Coffee";
            //String sqlstatement= " SELECT * FROM Coffee WHERE Price >= " +Double.toString(minPrice);

            String sqlstatement= " SELECT * FROM Coffee WHERE Price >= " +Double.toString(minPrice)+ "AND Description LIKE '%Decaf%'";

            ResultSet result= stmt.executeQuery(sqlstatement);

            System.out.println("Coffee found in the db");

            while (result.next())
            {
                System.out.printf("%25s %10s %5.2f\n",
                        result.getString("Description"),
                        result.getString("ProdNum"),
                        result.getDouble("Price"));

            }

        }catch(Exception ex)
        {
            System.out.println("ERROR: " + ex.getMessage());
        }

    }
}
