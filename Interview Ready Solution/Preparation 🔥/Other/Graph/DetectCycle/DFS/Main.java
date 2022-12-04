package Graph.DetectCycle.DFS;

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

        // 0 vertex
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));   // if comment this 0 to 2  and 2 to 0 return false.
        graph[0].add(new Edge(0,3));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));

        graph[2].add(new Edge(2,0));  // if comment this 0 to 2  and 2 to 0 return false.
        graph[2].add(new Edge(2,1));

        graph[3].add(new Edge(3,0));
        graph[3].add(new Edge(3,4));
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge>[] graph  = new ArrayList[V];

        CreateGraph(graph);

        // bfs traversal in graph
        System.out.println(detectCycle(graph));
    }

    public static boolean detectCycle(ArrayList<Edge> [] graph){
        boolean[] visited = new boolean[graph.length];
        for(int i=0; i<graph.length; i++){
            if(!visited[i]){
                if(detectCycleUtil(graph,visited,i,-1)) {   // from whom we start don't have parent so -1;
                    return true;  // cycle exists in one of the parts.
                }
            }
        }
        return false;
    }
    public  static  boolean detectCycleUtil(ArrayList<Edge>[] graph, boolean[] visited , int curr, int parent){
        visited[curr] = true;
        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            // case 3.
            if(!visited[e.dest]){
                if( detectCycleUtil(graph,visited,e.dest,curr)){
                return true;
                }
            }else if(visited[e.dest] && e.dest!=parent){
                // case 2.
                return true;
            }
            // case 2;
//                continue; do nothing
        }
        return false;
    }

}

