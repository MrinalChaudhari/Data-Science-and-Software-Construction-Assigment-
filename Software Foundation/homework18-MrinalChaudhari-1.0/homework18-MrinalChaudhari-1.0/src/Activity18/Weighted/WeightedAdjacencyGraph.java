package Activity18.Weighted;

import java.util.*;

public abstract class WeightedAdjacencyGraph<T> implements WeightedGraph<T> {

    private Map<T, Vertex<T>> vertices;
    private T start;
    private T end;
    int distance=Integer.MAX_VALUE;
    public WeightedAdjacencyGraph() {
        vertices=new HashMap<>();
    }

    @Override
    public void addValue(T value) {
        Vertex<T> vertex = new Vertex<>(value);
        vertices.put(value,vertex);
    }

    @Override
    public void connect(T value, T neighbor, int weight) {

        Vertex<T> vertex = vertices.get(value);
        Vertex<T> neighborV = vertices.get(neighbor);
        vertex.addNeighbor(neighborV,weight);
    }

    @Override
    public List<T> dijkstrasShortestPath() {
        Vertex<T> startVertex=vertices.get(start);
        Vertex<T> endVertex=vertices.get(end);
        Map<Vertex<T>, pathTuple<T>> visited= new HashMap<>();
        visited.put(startVertex,new pathTuple<>(null,0));

        List<Vertex<T>> Vertices_list = new ArrayList<>();
        Vertices_list.add(startVertex);
        for(int i = 0; i < vertices.size();i++){
            Vertex<T> v = Vertices_list.get(i);
            for (Edge<T> edge:v.getNeighbors()) {
                if(!Vertices_list.contains(edge.getTo())) {
                    Vertices_list.add(edge.getTo());
                    visited.put(edge.getTo(), new pathTuple<>(null, distance));
                }
            }
        }
        while(Vertices_list.size()>0){
            int weight=Integer.MAX_VALUE;
            int index=0;
            for(int i=0;i<Vertices_list.size();i++){
                Vertex<T> vertex=Vertices_list.get(i);
                pathTuple<T> path=visited.get(vertex);
                if(path.distance<weight){
                    weight=path.distance;
                    index=i;
                }
            }
            Vertex<T> v=Vertices_list.remove(index);
            for (Edge<T> e: v.getNeighbors() ) {
                Vertex<T> neighbor=e.getTo();
                int tupleWeight = visited.get(neighbor).distance;
                if(weight + visited.get(v).distance < tupleWeight){
                    visited.get(neighbor).neighbor=v;
                }
            }
        }
        List<Vertex<T>> list=new ArrayList<>();
        Vertex<T> vertex1 = endVertex;
        while(vertex1!=startVertex){
            pathTuple<T> pt=visited.get(vertex1);
            vertex1=pt.neighbor;
            list.add(vertex1);
        }

        return (List<T>) list;

    }
}