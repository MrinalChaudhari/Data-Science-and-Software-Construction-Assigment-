package Homework17;

import java.util.List;
import java.util.Scanner;

public class ChessBoard {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter value of Row and Column: ");
        int row, column;
        row= input.nextInt();
        column=input.nextInt();
        int count=0;
        System.out.println("Row: " +row + "Column: " + column);

        Graph<Integer> chessboard = new AdjacencyGraph();
        //posoition of the board
        int[] knightmoves = new int[row * column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                knightmoves[count]=Integer.parseInt(i +Integer.toString(j));
                chessboard.addValue(Integer.parseInt(i + Integer.toString(j)));
                count++;
            }
        }
        //Checking possible moves of knight
        chessboard.addMoves(knightmoves);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (i + 1 < row && j + 2 < column) {
                    chessboard.connectUndirected(Integer.parseInt(i + Integer.toString(j)), Integer.parseInt((i + 1) + Integer.toString(j + 2)));
                }
                if (i - 1 >= 0 && j + 2 < column) {
                    chessboard.connectUndirected(Integer.parseInt(i + Integer.toString(j)), Integer.parseInt((i - 1) + Integer.toString(j + 2)));
                }
                if (i + 2 < row && j + 1 < column) {
                    chessboard.connectUndirected(Integer.parseInt(i + Integer.toString(j)), Integer.parseInt((i + 2) + Integer.toString(j + 1)));
                }
                if (i - 2 >= 0 && j + 1 < column) {
                    chessboard.connectUndirected(Integer.parseInt(i + Integer.toString(j)), Integer.parseInt((i - 2) + Integer.toString(j + 1)));
                }
                if (i + 2 < row && j - 1 >= 0) {
                    chessboard.connectUndirected(Integer.parseInt(i + Integer.toString(j)), Integer.parseInt((i + 2) + Integer.toString(j - 1)));
                }
                if (i - 2 >= 0 && j - 1 >= 0) {
                    chessboard.connectUndirected(Integer.parseInt(i + Integer.toString(j)), Integer.parseInt((i - 2) + Integer.toString(j - 1)));
                }
                if (i + 1 < row && j - 2 >= 0) {
                    chessboard.connectUndirected(Integer.parseInt(i + Integer.toString(j)), Integer.parseInt((i + 1) + Integer.toString(j - 2)));
                }
                if (i - 1 >= 0 && j - 2 >= 0) {
                    chessboard.connectUndirected(Integer.parseInt(i + Integer.toString(j)), Integer.parseInt((i - 1) + Integer.toString(j - 2)));
                }
            }
        }
        boolean quit = true;
        do {
            System.out.println("Enter <row1> <col1> <row2> <col2> or quit:");
            String row1 = input.next();
            if (row1.equals("quit")) {
                System.out.println("Goodbye");
                System.exit(0);
            }

            int col1 = input.nextInt();
            int row2 = input.nextInt();
            int col2 = input.nextInt();
            System.out.print("Values: ");
            System.out.print(" " + row1);
            System.out.print(" " + col1);
            System.out.print(" " + row2);
            System.out.print(" " + col2);

            int row3 = Integer.parseInt(row1);
            if (row3 < 0 || col1 < 0 || row2 < 0 || col2 < 0) {
                System.out.println("No path exists from (" + row1 + "," + col1 + ") to " + row2 + "," + col2 + ")");
                System.exit(0);
            }
            List<Integer> list = chessboard.breadthFirstPath(Integer.parseInt(row1 + col1), Integer.parseInt(row2 + Integer.toString(col2)));
            System.out.println(list);

            int a = 0;
            for (int i = 0; i <= row; i++) {
                for (int j = 0; j <= column; j++) {
                    System.out.print("| ");
                    if (list.get(a) == (Integer.parseInt(row1 + col1))) {
                        System.out.print("S");
                        a++;

                    } else if (list.get(a) == (Integer.parseInt(i + Integer.toString(j)))) {
                        System.out.print(list.get(a));
                        a++;

                    } else if (list.get(a) == (Integer.parseInt(row2 + Integer.toString(col2)))) {
                        System.out.print("E");
                    }
                }
                System.out.print("\n");
            }
        }while (quit == true) ;
    }
}
