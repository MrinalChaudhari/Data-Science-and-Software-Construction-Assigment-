package Homework11;

//exception class

public class Exceptionclass extends  Exception {
    public Exceptionclass(String message) {
        super(message);

    }

    public static void main(String[] args) {
        Exception e = new Exceptionclass("Negative value");
        System.out.println(e.getMessage());
        e.printStackTrace();
    }
}