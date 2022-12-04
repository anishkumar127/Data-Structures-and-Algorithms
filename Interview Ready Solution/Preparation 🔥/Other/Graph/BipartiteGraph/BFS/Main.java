package Graph.BipartiteGraph.BFS;

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
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));  // if comments this part cycle will remove and its return true. it will be bipartite graph.

        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));   // if comments this part cycle will remove and its return true. it will be bipartite graph.
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge>[] graph  = new ArrayList[V];

        CreateGraph(graph);

        // bfs traversal in graph
        System.out.println(isBipartite(graph)); // return false. because cycle not exists.
//        note -> which graph doesn't has cycle that always will be bipartite graph. if have cycle then its not bipartite graph.
    }

    public static boolean isBipartite(ArrayList<Edge>[] graph){
        int[] color = new int [graph.length];
        Arrays.fill(color,-1); // no color

        Queue<Integer> que = new LinkedList<>();
        for(int i=0; i< graph.length; i++){
            if(color[i]==-1){
                // bfs
                que.add(i);
                color[i] = 0; // yellow
                while(!que.isEmpty()){
                    int curr = que.remove();
                    for(int j=0; j<graph[curr].size(); j++){
                        Edge e = graph[curr].get(j);  // neighbours e.dest
                        // case 1 . not color.
                        if(color[e.dest]==-1){
                            int nextColor = color[curr]==0 ? 1 : 0;
                            color[e.dest] = nextColor;
                            que.add(e.dest);
                        }else if(color[e.dest] == color[curr]){
                            return false;  // color same. not bipartite
                        }
                    }
                }
            }
        }
        return true;
    }
}

