package session.Activity4;

import java.util.Scanner;

public class ArrayFilling {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number");
        int N=input.nextInt();
        int[] size=new int[N];
        Arrayfill(N);
    }
    public static int Arrayfill(int N)
    {
        for(int i=0;i<N;i++)
        {
            System.out.println(i*10);
        }
        return N;
    }

}
