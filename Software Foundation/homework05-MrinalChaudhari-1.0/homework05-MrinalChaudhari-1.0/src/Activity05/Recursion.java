Package Activity05;

public class Recursion {
    static void CountUp(int n)
    {

        if(n > 0)
        {
            CountUp(n - 1);
            System.out.println(n + " ");
        }
        return;
    }

    public static void main(String[] args)
    {
        CountUp(20000);
    }
}


