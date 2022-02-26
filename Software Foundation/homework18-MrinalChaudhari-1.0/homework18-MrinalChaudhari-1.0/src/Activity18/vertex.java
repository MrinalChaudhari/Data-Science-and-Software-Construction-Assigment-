package Activity18;

import java.util.HashSet;
import java.util.Set;

public class vertex<T> {

    private T value;
    private Set<vertex<T>> neighbors;

    vertex(T value) {
        this.value = value;
        neighbors = new HashSet<>();
    }

    T getValue() {
        return value;
    }

    void addNeighbor(vertex<T> neighbor) {
        neighbors.add(neighbor);
    }

    Set<vertex<T>> getNeighbors() {
        return neighbors;
    }
}
