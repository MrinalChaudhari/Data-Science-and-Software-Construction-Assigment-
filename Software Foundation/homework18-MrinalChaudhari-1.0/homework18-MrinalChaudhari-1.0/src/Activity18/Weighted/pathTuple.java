package Activity18.Weighted;

import java.util.HashMap;
import java.util.Map;

public class pathTuple<T> {
    Vertex<T> neighbor;
    int distance;

    public pathTuple(Vertex<T> neighbor, int distance) {
        this.neighbor = neighbor;
        this.distance = distance;

    }
}
