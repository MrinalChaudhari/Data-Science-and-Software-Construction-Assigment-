Package Activity05;

public class CountDown {
    static void Countdown(int n)
    {
        if(n < 0) {
            return;
        }else{
            System.out.println(n);
            Countdown(n -1);

        }

    }
    public static void main(String[] args)
    {

        //Countdown(10);
        Countdown(20000);
    }
}


