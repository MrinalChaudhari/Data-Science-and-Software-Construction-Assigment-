package Activity08;

public class Shallow {

    public static void main(String[] args){
        int a=4;
        int b=5;
        double c=4;

        System.out.println(equate(a,b));
    }
    public static boolean equate(int a, double c){
        if(a==c)
            return true;
        else
            return false;
    }
}
