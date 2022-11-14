```java
//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) adj.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            boolean ans = obj.isCycle(V, adj);
            if (ans)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean[] visited = new boolean[V];
        for(int i=0; i<V; i++){
            if(!visited[i]){   
            if(detectCycleUtil(adj,visited,i,-1)){
                return true;
            }
            }
        }
        return false;
    }
    public boolean detectCycleUtil(ArrayList<ArrayList<Integer>>graph , boolean[]visited, int curr, int parent){
        visited[curr] = true;
        for(int i=0; i<graph.get(curr).size(); i++){
            int e  = graph.get(curr).get(i);
            if(!visited[e]){
                if(detectCycleUtil(graph,visited,e,curr)){
                    return true;
                }
            }else if(visited[e] && e!=parent) return true;
        }
        return false;
    }
}
```

```java

class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean[] visited = new boolean[V];
        for(int i=0; i<V; i++){
            if(!visited[i]){   
            if(detectCycleUtil(adj,visited,i,-1)){
                return true;
            }
            }
        }
        return false;
    }
    public boolean detectCycleUtil(ArrayList<ArrayList<Integer>>graph , boolean[]visited, int curr, int parent){
        visited[curr] = true;
        for(int i=0; i<graph.get(curr).size(); i++){
            int e  = graph.get(curr).get(i);
            if(!visited[e]){
                if(detectCycleUtil(graph,visited,e,curr)){
                    return true;
                }
            }else if(visited[e] && e!=parent) return true;
        }
        return false;
    }
}
```

```java
class Solution {

    public boolean dfs(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited, int parent){

        visited[s] = true;

        for(int u : adj.get(s)){

            if(visited[u] == false){

                if(dfs(adj, u, visited, s) == true) return true;

            }

            else if(u != parent) return true;

        }

        return false;

    }

    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {

        boolean[] visited = new boolean[V + 1];

        for(int i = 0; i < V; i++){

            if(visited[i] == false){

                if(dfs(adj, i, visited, -1) == true) return true;

            }

        }

        return false;

    }

}
```
**BFS**
```java
class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean[] visited = new boolean[adj.size()+1];
        Queue<Integer> q = new LinkedList<>();
        
        for (int i=0; i < adj.size() ; i++) {
            if (visited[i]) continue;
            q.add(i);
            
            while (!q.isEmpty()) {
                int node = q.poll();
                
                if (visited[node]) return true;
                else visited[node] = true;
                
                for (int n : adj.get(node))
                    if (visited[n]) continue;
                    else q.add(n);
            }
        }
        
        return false;
    }
}
// 1. if visiting a already visited node => cycle exist
```

```java
//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) adj.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            boolean ans = obj.isCycle(V, adj);
            if (ans)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
         boolean[] visited = new boolean[adj.size()+1];
        Queue<Integer> q = new LinkedList<>();
        
        for (int i=0; i < adj.size() ; i++) {
            if (visited[i]) continue;
            q.add(i);
            
            while (!q.isEmpty()) {
                int node = q.poll();
                
                if (visited[node]) return true;
                else visited[node] = true;
                
                for (int n : adj.get(node))
                    if (visited[n]) continue;
                    else q.add(n);
            }
        }
        
        return false;
    }
}
```

``theory``
Given an undirected graph with V vertices and E edges, check whether it contains any cycle or not. 

Example 1:

Input:  
V = 5, E = 5
adj = {{1}, {0, 2, 4}, {1, 3}, {2, 4}, {1, 3}} 
Output: 1
Explanation: 

1->2->3->4->1 is a cycle.
Example 2:

Input: 
V = 4, E = 2
adj = {{}, {2}, {1, 3}, {2}}
Output: 0
Explanation: 

No cycle in the graph.
 

Your Task:
You don't need to read or print anything. Your task is to complete the function isCycle() which takes V denoting the number of vertices and adjacency list as input parameters and returns a boolean value denoting if the undirected graph contains any cycle or not, return 1 if a cycle is present else return 0.

NOTE: The adjacency list denotes the edges of the graph where edges[i] stores all other vertices to which ith vertex is connected.

 

Expected Time Complexity: O(V + E)
Expected Space Complexity: O(V)


 

Constraints:
1 ≤ V, E ≤ 105