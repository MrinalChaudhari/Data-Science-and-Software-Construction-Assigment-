package Activity18.Weighted;

import Activity18.vertex;

import java.util.HashSet;
import java.util.Set;

    class Vertex<T> {

        private T value;

        private Set<Edge<T>> neighbors;
        Vertex(T value) {
            this.value=value;
            neighbors=new HashSet<>();
        }
        void addNeighbor(Vertex<T> neighbor,int weight) {
            Edge<T> edge=new Edge(this,neighbor,weight);

            neighbors.add(edge);
        }

        public T getValue() {
            return value;
        }

        public Set<Edge<T>> getNeighbors() {
            return this.neighbors;

        }
    }
