package Homework11;

import java.util.Scanner;
import java.util.Random;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

//sortshape is the method which will return shape array of sorted area using selection sort.

public class ShapeArray {//ShapeArray class

    //sortshape method to sort area of shapes
    public static Shape[] sortShape(Shape[] arr1) {

        int n = arr1.length;
        for (int i = 0; i < n; i++) {
            int min_area = i;
            for (int j = i + 1; j < n - 1; j++) {
                if ((arr1[j] != null && arr1[min_area] != null) && (arr1[j].area() < arr1[min_area].area()))
                    min_area = j;
            }
            Shape temp = arr1[min_area];
            arr1[min_area] = arr1[i];
            arr1[i] = temp;
        }
        return arr1;
    }

    //this metthod used to store object of array in file
    public static void saveShapesToFile(Shape[] arr1){
        OutputStream op = null;
        ObjectOutputStream objOp = null;
        try {
            op = new FileOutputStream("C:\\Users\\Mrinal\\SWEN-601-03\\homework11-MrinalChaudhari\\src\\Homework11\\MyShape.txt");
            objOp = new ObjectOutputStream(op);
            objOp.writeObject(arr1);
            objOp.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            try{
                if(objOp != null) objOp.close();
            } catch (Exception ex){

            }
        }

    }
    //loadshapetofile method used to read the store object in file
    public static void loadShapesToFile(){
        InputStream Ip = null;
        ObjectInputStream obj = null;
        try {
            Ip = new FileInputStream("C:\\Users\\Mrinal\\SWEN-601-03\\homework11-MrinalChaudhari\\src\\Homework11\\MyShape.txt");
            obj = new ObjectInputStream(Ip);
            Shape shape = (Shape) obj.readObject();
            System.out.println(shape);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if(obj != null)
                    obj.close();
            } catch (Exception ex){

            }
        }

    }

    public static void main(String[] args) {     //main class starts
        Scanner input = new Scanner(System.in);

        /**user prompts the size of array
         *array contains randomly assigned object(circle,triangle etc), and states of object is randomly assigned
         * */
        System.out.println("Enter Size of array between 2 to 20");
        int arraySize = input.nextInt();
        Shape[] arr1 = new Shape[arraySize];
        for (int j = 0; j < arraySize; j++) {
            String str;
            Random r1 = new Random();
            int choice = r1.nextInt(2);
            str = switch (choice) {
                case 0 -> "Circle";
                case 1 -> "Rectangle";
                case 2 -> "Triangle";
                default -> "invalid";
            };

            switch (str) {
                case "Circle" -> arr1[j] = new Circle(new Position((int) Math.random() * 50+50, (int) (Math.random() * 50+50)), "Pink", "Black", (int) Math.random() * 50+50);
                case "Rectangle" -> arr1[j] = new Rectangle(new Position((int) Math.random() * 50+50, (int) (Math.random() * 50+50)), "Brown", "Yellow", (int) Math.random() * 50+50, (int) Math.random() * 50+50);
                case "Triangle" -> arr1[j] = new Triangle(new Position((int) Math.random() * 50+50, (int) (Math.random() * 50+50)), "Blue", "Orange", (int) Math.random() * 50+50);
                default -> throw new IllegalStateException("Unexpected value: " + str);

            }
            ;
            print("Perimeter :" + arr1[j].perimeter());
            print("Area :" + arr1[j].area());
            print("Position :" + arr1[j].getPos());
        }
        Shape test[] = sortShape(arr1);
        for (int i = 0; i < arraySize; i++) {
            System.out.println(test[i]);

        }
        saveShapesToFile(arr1);
        loadShapesToFile();

    }
    public static void print(String filter) {
        System.out.println(filter);

    }//main class ends

}//shapeArray class ends
