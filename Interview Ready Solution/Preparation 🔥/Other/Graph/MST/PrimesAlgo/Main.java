package Graph.MST.PrimesAlgo;
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
    static class Pair implements Comparable<Pair>{
        int v;
        int cost;
        public Pair (int v, int c){
            this.v=v;
            this.cost = c;
        }
        @Override
        public int compareTo(Pair p2){
            return this.cost  - p2.cost; // accending.
        }
    }
    public static void CreateGraph(ArrayList<Edge>[] graph){
        // fill empty to array list.
        for(int i= 0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        // undirected weight graph
        graph[0].add(new Edge(0,1,10));
        graph[0].add(new Edge(0,2 , 15));
        graph[0].add(new Edge(0,3 , 30));

        graph[1].add(new Edge(1,0,10));
        graph[1].add(new Edge(1,3,40));

        graph[2].add(new Edge(2,0,15));
        graph[2].add(new Edge(2,3,50));

        graph[3].add(new Edge(3,1 , 40));
        graph[3].add(new Edge(3,2 , 50));

    }
    public static void primsMST(ArrayList<Edge>[] graph){
        boolean [] visited = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(0,0));
        int finalCost = 0; // MST Cost/ toal min weight;
        while(!pq.isEmpty()){
            Pair curr = pq.remove();
            if(!visited[curr.v]){
                visited[curr.v] = true;
                finalCost +=curr.cost;

                for(int i=0; i<graph[curr.v].size(); i++){
                    Edge e = graph[curr.v].get(i);
                    pq.add(new Pair(e.dest,e.wt));
                }
            }
        }
        // print
        System.out.println("final(min) cost of MST = "+finalCost);
    }
    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge>[] graph  = new ArrayList[V];
        CreateGraph(graph);
        primsMST(graph);
    }
}

