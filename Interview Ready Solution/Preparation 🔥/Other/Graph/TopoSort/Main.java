package Graph.TopoSort;

import java.util.ArrayList;

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

        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,1));
        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));

        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));


    }
public static void topSort(ArrayList<Edge>[] graph){
        boolean[] visited = new boolean[graph.length];
        Stack<Integer> helper_Stack = new Stack<>();
        for(int i=0; i<graph.length; i++){
            if(!visited[i]){
                topSortUtil(graph,i, visited,helper_Stack);  // modified dfs
            }
        }
        // print
    while(!helper_Stack.isEmpty()){
        System.out.print(helper_Stack.pop()+" ");
    }
}

public static void topSortUtil(ArrayList<Edge>[] graph, int curr, boolean[] visited, Stack<Integer>helper_Stack){
        visited[curr] = true;
        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!visited[e.dest]){
                topSortUtil(graph,e.dest,visited,helper_Stack);
            }
        }
            helper_Stack.push(curr);
}
    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge>[] graph  = new ArrayList[V];

        CreateGraph(graph);
        topSort(graph);
    }

}

