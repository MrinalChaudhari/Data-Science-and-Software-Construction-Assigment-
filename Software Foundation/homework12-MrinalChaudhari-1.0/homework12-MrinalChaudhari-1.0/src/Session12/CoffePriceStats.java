package Session12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CoffePriceStats {
    public static void main(String[] args) {
        // Database connection
        double lowest = 0,highest=0,average=0;
        final String url = "jdbc:mysql://localhost:3306/Coffee";
        final String user = "root";
        final String password = "";
        try {
            Connection conn = DriverManager.getConnection(url, user, password);

            Statement stmt = conn.createStatement();
            String Min= "SELECT MIN(Price) FROM Coffee ";
            String Max= "SELECT MAX(Price) FROM Coffee ";
            String Avg= "SELECT AVG(Price) FROM Coffee ";

            ResultSet minResult=stmt.executeQuery(Min);
            if(minResult.next())
                lowest= minResult.getDouble(1);

            ResultSet maxResult=stmt.executeQuery(Max);
            if(maxResult.next())
                highest= maxResult.getDouble(1);

            ResultSet avgResult=stmt.executeQuery(Avg);
            if(avgResult.next())
                average= avgResult.getDouble(1);

            System.out.printf("Lowest Price: $%.2f\n", lowest);
            System.out.printf("Highest  Price: $%.2f\n", highest);
            System.out.printf("Average Price: $%.2f\n", average);

            conn.close();

        }catch(Exception ex)
        {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }
}
