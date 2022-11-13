```java
//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] S = br.readLine().trim().split(" ");
            int V = Integer.parseInt(S[0]);
            int E = Integer.parseInt(S[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for(int i = 0; i < V; i++){
                adj.add(new ArrayList<Integer>());
            }
            for(int i = 0; i < E; i++){
                String[] s = br.readLine().trim().split(" ");
                int u = Integer.parseInt(s[0]);
                int v = Integer.parseInt(s[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            boolean ans = obj.isBipartite(V, adj);
            if(ans)
                System.out.println("1");
            else System.out.println("0");
       }
    }
}
// } Driver Code Ends


class Solution
{
    public boolean isBipartite(int V, ArrayList<ArrayList<Integer>>graph)
    {
        // Code here
        int[] color = new int [graph.size()];
        Arrays.fill(color,-1); // no color

        Queue<Integer> que = new LinkedList<>();
        for(int i=0; i< graph.size(); i++){
            if(color[i]==-1){
                // bfs
                que.add(i);
                color[i] = 0; // yellow
                while(!que.isEmpty()){
                    int curr = que.remove();
                    for(int j=0; j<graph.get(curr).size(); j++){
                        int e = graph.get(curr).get(j);  // neighbours e.dest
                        // case 1 . not color.
                        if(color[e]==-1){
                            int nextColor = color[curr]==0 ? 1 : 0;
                            color[e] = nextColor;
                            que.add(e);
                        }else if(color[e] == color[curr]){
                            return false;  // color same. not bipartite
                        }
                    }
                }
            }
        }
        return true;
    }
}

/*
Bi - 2.
partbite - > parts / partitions   
devide into 2.  u and v 1st and 2nd.
if can divide return true. else false.

*/

```


```java

class Solution
{
    public boolean isBipartite(int V, ArrayList<ArrayList<Integer>>graph)
    {
        // Code here
        int[] color = new int [graph.size()];
        Arrays.fill(color,-1); // no color

        Queue<Integer> que = new LinkedList<>();
        for(int i=0; i< graph.size(); i++){
            if(color[i]==-1){
                // bfs
                que.add(i);
                color[i] = 0; // yellow
                while(!que.isEmpty()){
                    int curr = que.remove();
                    for(int j=0; j<graph.get(curr).size(); j++){
                        int e = graph.get(curr).get(j);  // neighbours e.dest
                        // case 1 . not color.
                        if(color[e]==-1){
                            int nextColor = color[curr]==0 ? 1 : 0;
                            color[e] = nextColor;
                            que.add(e);
                        }else if(color[e] == color[curr]){
                            return false;  // color same. not bipartite
                        }
                    }
                }
            }
        }
        return true;
    }
}

/*
Bi - 2.
partbite - > parts / partitions   
devide into 2.  u and v 1st and 2nd.
if can divide return true. else false.

*/
```



