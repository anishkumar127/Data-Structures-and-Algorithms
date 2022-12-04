package Graph.BFS_Scanner;

import java.util.LinkedList;
        import java.util.Queue;
        import java.util.Scanner;
public class Graph {
    private LinkedList<Integer> adjacencyList[];
    public Graph (int vertex) {
        adjacencyList = new LinkedList[vertex];
        for (int i = 0; i < vertex; i++) {
            adjacencyList[i] = new LinkedList<Integer>();
        }
    }
    public void addEdge(int start, int finish) {
        adjacencyList[start].add(finish);
        adjacencyList[finish].add(start);
    }
    // minimum distance between start and finish nodes using BFS
    public int BFS(int start, int finish) {
        // array to hold vertices already visited
        boolean[] visited = new boolean[adjacencyList.length];
        //parent array holds value of vertex which introduced this vertex
        int[] parent = new int[adjacencyList.length];
        Queue<Integer> q = new LinkedList<>();

        q.add(start);
        parent[start] = -1;
        visited[start] = true;
        while (!q.isEmpty()) {
            // pull out the first vertex in the queue
            int current = q.poll();
            // if the vertex pulled is the last one, break loop
            if (current == finish) break;
            for (int neighbour: adjacencyList[current]) {
                // if neighbour hasn't been visited
                if(!visited[neighbour]) {
                    visited[neighbour] = true;
                    // add to the queue
                    q.add(neighbour);
                    // since current vertex introduced us
                    parent[neighbour] = current;
                }
            }
        }
        //traverse through the parent array
        int current = finish;
        int distance = 0;
        while (parent[current] != -1) {
            System.out.print(current + "-> ");
            current = parent[current];
            distance++;
        }
        System.out.print(start);
        return distance;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of vertices and edges");
        int vertices = sc.nextInt();  // 5
        int edges = sc.nextInt();   // 4
        // define graph
        Graph graph = new Graph(vertices);
        // input edges and initialize graph
        System.out.printf("Enter %d edges: ", edges);
        for (int i = 0; i < edges; i++) {
            int start = sc.nextInt();
            int finish = sc.nextInt();
            graph.addEdge(start, finish);
        }
        System.out.println("Enter start and end vertex");
        int start = sc.nextInt();
        int finish = sc.nextInt();
        int distance = graph.BFS(start, finish);
        System.out.println("\nMinimum distance between " + start + "           & " + finish + " is " + distance);
    }
}