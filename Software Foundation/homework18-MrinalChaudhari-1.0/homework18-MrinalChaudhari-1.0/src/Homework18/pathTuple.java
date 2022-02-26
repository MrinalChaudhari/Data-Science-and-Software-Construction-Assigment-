package Homework18;

public class pathTuple<T> {
    Vertex<T> neighbor;
    int distance;

    public pathTuple(Vertex<T> neighbor, int distance) {
        this.neighbor = neighbor;
        this.distance = distance;

    }
    public Vertex<T> getNeighbor() {
        return neighbor;
    }
    public void setNeighbor(Vertex<T> neighbor) {
        this.neighbor = neighbor;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

}
// end of class