package Graph.BellmanFordAlgo;
import java.util.*;
public class Main {
    static class Edge{
        int src;     // source
        int dest ;  // destination
        int wt;     // weight

        public Edge(int s , int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }

    }
    public static void CreateGraph(ArrayList<Edge>[] graph){
        // fill empty to array list.
        for(int i= 0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2 , 4));

        graph[1].add(new Edge(1,2,-4));

        graph[2].add(new Edge(2,3,2));

        graph[3].add(new Edge(3,4 , 4));

        graph[4].add(new Edge(4,1, -1));

    }
    public static void bellmanFord(ArrayList<Edge>[] graph , int src){
        int dist[]  = new int[graph.length];
        for(int i=0; i<dist.length; i++){
            if(i!=src){
                dist[i] = Integer.MAX_VALUE;
            }
        }
        int V = graph.length;
        // algo
        for(int i=0; i<V-1; i++){
            // edges - O(E);
            for(int j=0; j<graph.length; j++){
                for(int k=0; k<graph[j].size(); k++){
                    Edge e= graph[j].get(k);
                    // u, v , wt
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;
                    // relaxation
                    if(dist[u] !=Integer.MAX_VALUE && dist[u]+ wt < dist[v]){
                        dist[v] = dist[u]+wt;
                    }
                }
            }
        }
        // display
        for(int i=0; i<dist.length; i++){
            System.out.print(dist[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge>[] graph  = new ArrayList[V];
        CreateGraph(graph);
        bellmanFord(graph,0);
    }
}

