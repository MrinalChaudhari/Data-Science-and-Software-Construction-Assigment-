package Exercise1;

public interface Comparable {
    public static int compare(Point x1, Point x2) {
        if (x1.getY() - x2.getY()<0) {
            return -1;
        } else if (x1.getY() - x2.getY()>0) {
            return 1;
        } else  {
            return 0;
        }
    }
}
