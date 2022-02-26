package Homework18;

import java.util.*;

public class WeightedAdjacencyGraph<T> implements WeightedGraph<T> {
    int distance=Integer.MAX_VALUE;
    private Map<T, Vertex<T>> vertices;
    int cost=0;

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
        Vertex<T> neighborVertex = vertices.get(neighbor);
        vertex.addNeighbor(neighborVertex,weight);

    }
    @Override
    public List<Vertex<T>> dijkstrasShortestPath(T start, T end) {
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
                int weight1=e.getWeight();
                Vertex<T> neighbor=e.getTo();
                int tupleWeight = visited.get(neighbor).distance;
                if(weight1 + visited.get(v).distance < tupleWeight){
                    visited.get(neighbor).setDistance(weight1+visited.get(v).getDistance());
                    visited.get(neighbor).neighbor=v;
                }
            }
        }
        List<Vertex<T>> list=new ArrayList<>();
        Vertex<T> vertex1 = endVertex;
        cost=visited.get(endVertex).getDistance();
        while(vertex1!=startVertex){
            if(!list.contains(vertex1)) {
                pathTuple<T> path = visited.get(vertex1);
                list.add(vertex1);
                vertex1 = path.neighbor;
            }
        }
        list.add(startVertex);
        List<Vertex<T>> listvertex = new ArrayList<>();
        Stack<Vertex<T>> stackvertex = new Stack<>();
        for (int i = 0; i < list.size();i++){
            stackvertex.push(list.get(i));
        }

        for(int i = 0; i <= stackvertex.size();i++){
            listvertex.add(stackvertex.pop());
        }
        listvertex.add(endVertex);
        return listvertex;
    }

}