package Exercise1;

public class Point implements Comparable {
    private int X=0;
    private int Y=0;

    public Point(int x, int y) {
        X = x;
        Y = y;
    }

    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }

    public boolean compare(Point X1, Point Y1) {
        if (compare(X1, Y1)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        int a= (Math.random())

    }
}
