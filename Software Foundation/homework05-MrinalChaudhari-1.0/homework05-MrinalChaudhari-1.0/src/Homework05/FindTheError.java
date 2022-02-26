Package Homework05;

public class FindTheError
{
    //write the Error here
    //method is calling itself without any return or break condition
    //hence it goes in infinite loop
    // function runs in infinte loop

    public static void main(String [] args)
    {
        myMethod(0);
    }
    public static void myMethod(int num)
    {
        System.out.println(num + " ");
        myMethod(num+1);
    }
 }