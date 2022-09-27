
class Solution
{
    //Function to return a list of nodes visible from the top view 
    //from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root)
    {
        TreeMap<Integer,Integer> tmap = new TreeMap<>();
        levelOrder(root,0,tmap);
        ArrayList<Integer> ans = new ArrayList<>(tmap.values());
        
        return ans;
        
    }
    static void levelOrder(Node root, int index ,TreeMap<Integer,Integer>tmap){
         Queue<Node> que = new LinkedList<>();
         Queue<Integer> lines = new LinkedList<>();
         que.add(root);
         lines.add(0);
        while(que.size()>0){
            Node curr = que.poll();
            int idx = lines.poll();
            
            if(!tmap.containsKey(idx)){
               tmap.put(idx, curr.data);
            }
             
            if(curr.left!=null){
                que.add(curr.left);
                lines.add(idx-1);
            }
            if(curr.right!=null){
                que.add(curr.right);
                lines.add(idx+1);
            }
        }
}
}


Given below is a binary tree. The task is to print the top view of binary tree. Top view of a binary tree is the set of nodes visible when the tree is viewed from the top. For the given below tree

       1
    /     \
   2       3
  /  \    /   \
4    5  6   7

Top view will be: 4 2 1 3 7
Note: Return nodes from leftmost node to rightmost node.

Example 1:

Input:
      1
   /    \
  2      3
Output: 2 1 3
Example 2:

Input:
       10
    /      \
  20        30
 /   \    /    \
40   60  90    100
Output: 40 20 10 30 100
Your Task:
Since this is a function problem. You don't have to take input. Just complete the function topView() that takes root node as parameter and returns a list of nodes visible from the top view from left to right.

Expected Time Complexity: O(NlogN)
Expected Auxiliary Space: O(N).

Constraints:
1 ≤ N ≤ 105
1 ≤ Node Data ≤ 105
