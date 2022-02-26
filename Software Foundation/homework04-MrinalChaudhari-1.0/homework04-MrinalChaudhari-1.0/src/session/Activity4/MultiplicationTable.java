package session.Activity4;

public class MultiplicationTable {

    public static void main(String args[])
    {
        int[][] table = new int[10][10];

        int i, j;
        for (i = 0; i < 10; i++)
        {
            for (j = 0; j < 10; j++)
            {
                table[i][j] = (i + 1) * (j + 1);
            }
        }


        for(i=0;i< table.length;i++)
        {
            for(j=0;j< table.length;j++)
            {
                System.out.print( table[i][j]+ "\t");
            }
            System.out.print("\n");
        }

    }

}
