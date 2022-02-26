package Homework18;


import java.util.List;
import java.util.Scanner;

public class RouteNetwork {
    public static void main(String[] args) {//main class starts
        WeightedAdjacencyGraph<String> Airports = new WeightedAdjacencyGraph();// new graph for creating airports code
        //adding values
        Airports.addValue("PDX");
        Airports.addValue("SFO");
        Airports.addValue("LAX");
        Airports.addValue("ORD");
        Airports.addValue("ROC");
        Airports.addValue("DCA");
        Airports.addValue("ATL");
        Airports.addValue("MCO");

        Airports.connect("PDX","ORD",26);
        Airports.connect("ORD","PDX",26);

        Airports.connect("PDX","LAX",21);
        Airports.connect("LAX","PDX",21);

        Airports.connect("SFO","ORD",37);
        Airports.connect("ORD","SFO",37);

        Airports.connect("SFO","DCA",25);
        Airports.connect("DCA","SFO",25);

        Airports.connect("SFO","LAX",10);
        Airports.connect("LAX","SFO",10);

        Airports.connect("ROC","DCA",10);
        Airports.connect("DCA","ROC",10);

        Airports.connect("ROC","ATL",22);
        Airports.connect("ATL","ROC",22);

        Airports.connect("ROC","MCO",24);
        Airports.connect("MCO","ROC",24);

        Airports.connect("ORD","ROC",15);
        Airports.connect("ROC","ORD",15);


        Airports.connect("LAX","DCA",36);
        Airports.connect("DCA","LAX",36);

        Airports.connect("LAX","ATL",31);
        Airports.connect("ATL","LAX",31);

        Airports.connect("LAX","MCO",31);
        Airports.connect("MCO","LAX",31);


        System.out.println("Enter airport codes: ");
        Scanner input=new Scanner(System.in);
        String source=input.next();
        String destination=input.next().trim();
        List<Vertex<String>> list=Airports.dijkstrasShortestPath(source,destination);
        for (Vertex<String> ver:list) {
            System.out.print(ver.getValue());
            System.out.print(" ");
        }
        //lowest path will get multiplied by 10 dolllors
        System.out.print(" "+Airports.cost*10+" Dollars");
    }
}
//end of class