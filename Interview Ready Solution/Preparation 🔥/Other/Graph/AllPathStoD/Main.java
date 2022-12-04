package Graph.AllPathStoD;

import java.util.*;
public class Main {
    static class Edge{
        int src;     // source
        int dest ;  // destination

        public Edge(int s , int d){
            this.src = s;
            this.dest = d;
        }

    }
    public static void CreateGraph(ArrayList<Edge>[] graph){
        // fill empty to array list.
        for(int i= 0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,3));
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,1));
        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));

        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));


    }

    // exponetial worst case canario.
    public static void printAllPath(ArrayList<Edge>[] graph, int src, int dest, String path){
        if(src==dest){
            System.out.println(path+dest);
            return;
        }
        // if not the neighbours call.
        for(int i=0; i<graph[src].size(); i++){
            Edge e = graph[src].get(i);
            printAllPath(graph,e.dest,dest,path+src);
        }
    }
    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge>[] graph  = new ArrayList[V];
        CreateGraph(graph);
        int src = 5;
        int dest = 1;
        printAllPath(graph,src,dest,"");
    }
}

