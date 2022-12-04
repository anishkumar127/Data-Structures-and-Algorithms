package Graph;
import java.util.*;

public class Main {
    static class Edge{
        int src;     // source
        int dest ;  // destination
        int wt;    // weight

        public Edge(int s , int d , int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void main(String[] args) {
        int V = 5;  // 0 to 5 vertex;
        ArrayList<Edge>[] graph = new ArrayList[V];

        // fill empty to array list.

        for(int i=0; i<V; i++){
            graph[i] = new ArrayList<>();
        }

        // 0 vertex
        graph[0].add(new Edge(0,1,5));

        // 1 vertex
        graph[1].add(new Edge(1,0,5));

        // 2 vertex
        graph[2].add(new Edge(2,1,1));
        graph[2].add(new Edge(2,3,1));
        graph[2].add(new Edge(2,4,2));

        // 3 vertex
        graph[3].add(new Edge(3,1,3));
        graph[3].add(new Edge(3,2,1));

        // 4 vertex
        graph[4].add(new Edge(4,2,2));


        // find the neighbours of 2's
        for(int i=0; i<graph[2].size(); i++){
            Edge e = graph[2].get(i);
            System.out.print(e.dest+" ");   // 1 3 4
        }
    }
}