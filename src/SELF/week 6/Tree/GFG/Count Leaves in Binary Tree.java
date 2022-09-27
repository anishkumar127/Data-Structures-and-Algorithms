/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
}*/

class Tree
{
    private int count = 0;
    int countLeaves(Node root) 
    {
        if(root==null) return 0;
        
        if(root.left==null && root.right==null) {
            count++;
        }
         countLeaves(root.left);
         countLeaves(root.right);
         return count;
        
    }
}



2nd;


class Tree
{
    private int count = 0;
    int countLeaves(Node root) 
    {
        if(root==null) return 0;
        
        if(root.left==null && root.right==null) {
            count++;
        }
       if(root.left!=null)  countLeaves(root.left);
       if(root.right!=null)  countLeaves(root.right);
         return count;
        
    }
}



3rd

/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
}*/

class Tree
{
    private int count = 0;
    int countLeaves(Node root) 
    {
        if(root==null) return 0;
        
        if(isLeaf(root)) count++;
       if(root.left!=null)  countLeaves(root.left);
       if(root.right!=null)  countLeaves(root.right);
         return count;
        
    }
    boolean isLeaf(Node root){
        if(root.left==null && root.right==null) {
            return true;
        }
        return false;
    }
}











Given a Binary Tree of size N , You have to count leaves in it. For example, there are two leaves in following tree

        1
     /      \
   10      39
  /
5

 

Example 1:


Input:
Given Tree is 
               4
             /   \
            8     10
           /     /   \
          7     5     1
         /
        3 
Output:
3
Explanation: 
Three leaves are 3 , 5 and 1.
 

Your Task:
You don't have to take input. Complete the function countLeaves() that takes root node of given tree as parameter and returns the count of leaves in tree . The printing is done by the driver code.
 

Constraints:
1<= N <= 104

 

Note:The Input/Ouput format and Example given below is used for system's internal purpose, and should be used by a user for Expected Output only. As it is a function problem, hence a user should not read any input from stdin/console, and should not print anything on stdout/console. The task is to complete the function specified, and not to write the full code.