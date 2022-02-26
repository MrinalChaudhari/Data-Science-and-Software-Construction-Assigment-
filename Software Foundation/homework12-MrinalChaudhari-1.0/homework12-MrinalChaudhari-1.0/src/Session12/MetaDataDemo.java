package Session12;

import java.sql.*;
import java.util.Scanner;

public class MetaDataDemo {
    public static void main(String[] args) throws SQLException {
        // Database connection
        final String url = "jdbc:mysql://localhost:3306/Coffee";
        final String user = "root";
        final String password = "";
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            Scanner input = new Scanner(System.in);

            System.out.printf("Enter a SELECT statement for " +
                    "the coffeeDB database:");

            String sql = input.nextLine();

            Statement stmt=conn.createStatement();

            ResultSet resultSet=stmt.executeQuery(sql);

            ResultSetMetaData meta= resultSet.getMetaData();

            System.out.println("The result set has " + meta.getColumnCount() + "columns(s).");

            for (int i=1;i<= meta.getColumnCount();i++){
                System.out.println(meta.getColumnName(i)+ ", " +meta.getColumnTypeName(i));
            }

            System.out.println("Results set rows:");
            while (resultSet.next()){
                for (int i=1;i<=meta.getColumnCount();i++){
                    System.out.println(resultSet.getString(i));
                }
                System.out.println();
            }
            stmt.close();
            conn.close();

        } catch (Exception ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }
}
