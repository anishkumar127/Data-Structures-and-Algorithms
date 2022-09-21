
/*
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class Solution
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node node) 
    {
         ArrayList<Integer> ans = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        
        if(node==null)return ans;
        
        q.offer(node);
        while(!q.isEmpty()){
            int n = q.size();
          for(int i=0; i<n; i++){
              Node temp = q.poll();
              ans.add(temp.data);
                if(temp.left!=null){
                    q.offer(temp.left);
                }
              if(temp.right!=null){
                q.offer(temp.right);
              }
          }
        }
        return ans;
    }
}





class Solution
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node node) 
    {
        // Your code here
        ArrayList<Integer> list =  new ArrayList<>();
        printLevelOrder(node, list);
        return list;
        
    }
    public static void printLevelOrder(Node root, ArrayList<Integer> list){
        Queue<Node> qs =new LinkedList<Node>();
        qs.add(root);
        while(!qs.isEmpty()){
            Node curr = qs.poll();
            list.add(curr.data);
            if(curr.left != null){
                qs.add(curr.left);
            }
            if(curr.right != null){
                qs.add(curr.right);
            }
        }
    }
}





Given a binary tree, find its level order traversal.
Level order traversal of a tree is breadth-first traversal for the tree.


Example 1:

Input:
    1
  /   \ 
 3     2
Output:1 3 2
Example 2:

Input:
        10
     /      \
    20       30
  /   \
 40   60
Output:10 20 30 40 60

Your Task:
You don't have to take any input. Complete the function levelOrder() that takes the root node as input parameter and returns a list of integers containing the level order traversal of the given Binary Tree.


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)


Constraints:
1 ≤ Number of nodes ≤ 105
1 ≤ Data of a node ≤ 105