package Homework12;


import java.sql.*;


public class ShapeCreator {

    public static void main(String[] args) {

        final String url = "jdbc:mysql://localhost:3306/shapedb";
        final String user = "root";
        final String password = "";

        try {
            // Create a connection to the database.
            Connection conn =
                    DriverManager.getConnection(url, user, password);

            dropTables(conn);
            createTables(conn);
            populateTables(conn);
            createOverlap(conn);


            conn.close();


        } catch (Exception ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }

    public static void dropTables(Connection conn)
    {
        System.out.println("Checking for existing tables.");

        try
        {
            // Get a Statement object.
            Statement stmt  = conn.createStatement();;

            try
            {
                // Drop the circle table.
                stmt.execute("DROP TABLE Circle ");
                System.out.println("Circle table dropped.");
            }
            catch(SQLException ex)
            {
            }

            try
            {
                // Drop the rectangle table.
                stmt.execute("DROP TABLE Rectangle");
                System.out.println("Rectangle table dropped.");
            }
            catch(SQLException ex)
            {
            }

            try
            {
                // Drop the triangle table.
                stmt.execute("DROP TABLE Triangle");
                System.out.println("Triangle table dropped.");
            }
            catch(SQLException ex)
            {
            }
            try
            {
                // Drop the overlap table.
                stmt.execute("DROP TABLE overlap");
                System.out.println("overlap table dropped.");
            }
            catch(SQLException ex)
            {
            }
        }
        catch(SQLException ex)
        {
            System.out.println("ERROR: " + ex.getMessage());
            ex.printStackTrace();
        }
    }


    public static void createTables(Connection conn)
    {
        try
        {
            Statement stmt = conn.createStatement();

            stmt.execute("CREATE TABLE Circle" +
                    "( ID INT PRIMARY KEY AUTO_INCREMENT, " +
                    "  Fillcolor CHAR(10),"  +
                    "  Linecolor CHAR(10),"  +
                    "  Position VARCHAR(5) "         +
                    "  Radius CHAR(5))");

            stmt.execute("CREATE TABLE Rectangle" +
                    "( ID INT PRIMARY KEY AUTO_INCREMENT, " +
                    "  Fillcolor CHAR(10),"  +
                    "  Linecolor CHAR(10),"  +
                    "  Position  VARCHAR(5) "         +
                    "  width CHAR(2),"    +
                    "  height CHAR(2) )");

            stmt.execute("CREATE TABLE Triangle" +
                    "( ID INT PRIMARY KEY AUTO_INCREMENT, " +
                    "  Fillcolor CHAR(10),"  +
                    "  Linecolor CHAR(10),"  +
                    "  Position VARCHAR(5)"         +
                    "  side CHAR(2) )");

            System.out.println("Tables created.");
            //stmt.close();

        }catch (Exception ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }

    }
    public static void populateTables(Connection conn){
        try {

            Statement stmt = conn.createStatement();

            for(int i=1;i<=10;i++)
            {
                Circle c1=new Circle(new Position((int) Math.random() * (20-1+1)+1, (int) (Math.random() * (20-1+1)+1)), "Pink", "Black", (int) Math.random() * (20-1+1)+1);
                Rectangle r1 =new Rectangle(new Position((int) Math.random() * (20-1+1)+1, (int) (Math.random() * (20-1+1)+1)), "Brown", "Yellow", (int) Math.random() * (20-1+1)+1, (int) Math.random() * (20-1+1)+1);
                Triangle t1 =new Triangle(new Position((int) Math.random() * (20-1+1)+1, (int) (Math.random() * (20-1+1)+1)), "Blue", "Orange", (int) Math.random() * (20-1+1)+1);

                stmt.execute("INSERT INTO Circle (Fillcolor, Linecolor, Position, Radius) VALUES ( " +
                        c1.getFillColor() +
                        c1.getLineColor()+
                         c1.getPos() +
                        c1.getRadius() );

                stmt.execute("INSERT INTO Rectangle (Fillcolor, Linecolor, Position, width, height) VALUES ( " +
                        r1.getFillColor()+
                        r1.getLineColor()+
                        r1.getPos()+
                        r1.getWidth()+
                        r1.getHeight() );

                stmt.execute("INSERT INTO Triangle (Fillcolor, Linecolor, Position, side) VALUES ( " +
                        t1.getFillColor()+
                        t1.getLineColor()+
                        t1.getPos()+
                        t1.getSide() );

                System.out.println("table entry created.");
                //stmt.close();
            }
        }catch (Exception ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }

    }
    public static void createOverlap(Connection conn){

        Shape s3=new Shape(new Position(6,5),"Pink","Black");
        try {

            Statement stmt = conn.createStatement();
            stmt.execute("CREATE TABLE overlap"+
                    s3.getClass()+
                    s3.getPos()+
                    s3.area()+
                    s3.perimeter());


        }catch (Exception ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }

    }


}
