package Session11;

public class ExceptionClass extends Exception{
    public ExceptionClass(String message) {
        super(message);

    }

    public static void main(String[] args) {
        Exception e = new ExceptionClass("Wrong Move");
        System.out.println(e.getMessage());
        e.printStackTrace();
    }

}
