package Homework15;

import java.util.Comparator;

public class Compare implements Comparator<Pokemon> {
    @Override
    public int compare(Pokemon o1, Pokemon o2) {
        if (o1.getValue() - o2.getValue()<0) {
            return -1;
        } else if (o1.getValue() -o2.getValue()>0) {
            return 1;
        } else  {
            return 0;
        }
    }
}
