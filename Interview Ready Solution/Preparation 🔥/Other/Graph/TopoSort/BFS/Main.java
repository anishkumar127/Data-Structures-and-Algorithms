package Graph.TopoSort.BFS;
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
    public static void calcIndeg(ArrayList<Edge>[] graph, int [] indeg){
        for(int i=0; i<graph.length; i++){
            int v = i;
            for(int j=0; j<graph[v].size();j++){
                Edge e = graph[v].get(j);
                indeg[e.dest]++;
            }
        }
    }
    public static void topSort(ArrayList<Edge>[] graph){
        int indeg[] = new int[graph.length];
        calcIndeg(graph,indeg);
        Queue<Integer> que = new LinkedList<>();
        for(int i=0; i<graph.length; i++){
            if(indeg[i]==0){
                que.add(i);
            }
        }
        // bfs
        while(!que.isEmpty()){
            int curr = que.remove();
            System.out.print(curr+" ");

            for(int i=0; i<graph[curr].size(); i++){
                Edge e = graph[curr].get(i);
                indeg[e.dest]--;
                if(indeg[e.dest]==0){
                    que.add(e.dest);
                }
            }
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge>[] graph  = new ArrayList[V];
        CreateGraph(graph);
        topSort(graph);
    }
}

