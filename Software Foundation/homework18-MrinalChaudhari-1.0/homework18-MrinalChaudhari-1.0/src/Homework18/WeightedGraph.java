package Homework18;

import java.util.List;

public interface WeightedGraph<T> {
    void addValue(T value);
    void connect(T value, T neighbor, int weight);
    List<Vertex<T>> dijkstrasShortestPath(T start, T end);

}
//end of interface