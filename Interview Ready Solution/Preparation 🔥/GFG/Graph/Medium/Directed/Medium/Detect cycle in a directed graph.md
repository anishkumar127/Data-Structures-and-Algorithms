```java
//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int V = sc.nextInt();
            int E = sc.nextInt();
            for (int i = 0; i < V; i++)
                list.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
            }
            if (new Solution().isCyclic(V, list) == true)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}
// } Driver Code Ends


/*Complete the function below*/

class Solution {
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> graph) {
        // code here
         boolean[] visited = new boolean[V];
        boolean[] stack = new boolean[V];

        for(int i=0; i< V; i++){
            if(!visited[i]){
                if(isCycleUtil(graph,i,visited,stack)){
                    return true;
                }
            }
        }
        return false;
    }
      public boolean isCycleUtil(ArrayList<ArrayList<Integer>>graph,int curr , boolean[] visited, boolean[] stack){

        visited[curr]=true;
        stack[curr] = true;

        for(int i=0; i<graph.get(curr).size(); i++){
            int e = graph.get(curr).get(i);
            if(stack[e]){
                // already true then return true cycle present.
                return true;
            }else if(!visited[e] && isCycleUtil(graph,e,visited,stack)){
                return true;
            }
        }
       stack[curr] = false;
        return false;
   }
}

```


```java

class Solution {
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> graph) {
        // code here
         boolean[] visited = new boolean[V];
        boolean[] stack = new boolean[V];

        for(int i=0; i< V; i++){
            if(!visited[i]){
                if(isCycleUtil(graph,i,visited,stack)){
                    return true;
                }
            }
        }
        return false;
    }
      public boolean isCycleUtil(ArrayList<ArrayList<Integer>>graph,int curr , boolean[] visited, boolean[] stack){

        visited[curr]=true;
        stack[curr] = true;

        for(int i=0; i<graph.get(curr).size(); i++){
            int e = graph.get(curr).get(i);
            if(stack[e]){
                // already true then return true cycle present.
                return true;
            }else if(!visited[e] && isCycleUtil(graph,e,visited,stack)){
                return true;
            }
        }
       stack[curr] = false;
        return false;
   }
}
```


Given a Directed Graph with V vertices (Numbered from 0 to V-1) and E edges, check whether it contains any cycle or not.


Example 1:

Input:



Output: 1
Explanation: 3 -> 3 is a cycle

Example 2:

Input:


Output: 0
Explanation: no cycle in the graph

Your task:
You dont need to read input or print anything. Your task is to complete the function isCyclic() which takes the integer V denoting the number of vertices and adjacency list as input parameters and returns a boolean value denoting if the given directed graph contains a cycle or not.


Expected Time Complexity: O(V + E)
Expected Auxiliary Space: O(V)


Constraints:
1 ≤ V, E ≤ 105