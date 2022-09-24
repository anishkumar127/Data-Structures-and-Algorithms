
class Solution {
    //Function to find the height of a binary tree.
    int height(Node node) 
    {
        // code here 
        if(node ==null) return 0;
        
        int LHS = 1+ height(node.left);
        int RHS = 1+ height(node.right);
        int max = Math.max(LHS,RHS);
        return max;
    }
}




class Solution {
    
    int height(Node node) 
    {
        if(node ==null) return 0;    
        int LHS = 1+ height(node.left);
        int RHS = 1+ height(node.right);
        return Math.max(LHS,RHS);
        
    }
}


class Solution {
    //Function to find the height of a binary tree.
    int height(Node node) 
    {
        // code here 
        
        // Level Order Traversal (BFS) Approach
        
        if(node == null)    return 0;
        Queue<Node> q = new LinkedList<>();
        int height=0;
        q.offer(node);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                Node cur_node = q.poll();
                if(cur_node.left!=null) q.offer(cur_node.left);
                if(cur_node.right!=null)    q.offer(cur_node.right);
            }
            height++;
        }
        return height; 
    }
}


Given a binary tree, find its height.


Example 1:

Input:
     1
    /  \
   2    3
Output: 2
Example 2:

Input:
  2
   \
    1
   /
 3
Output: 3   

Your Task:
You don't need to read input or print anything. Your task is to complete the function height() which takes root node of the tree as input parameter and returns an integer denoting the height of the tree. If the tree is empty, return 0. 


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)


Constraints:
1 <= Number of nodes <= 105
1 <= Data of a node <= 105

