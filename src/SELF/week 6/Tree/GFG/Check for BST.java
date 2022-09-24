first approach 
inorder ans store into array list.
and then check it if previous element is greater then next element. then its mean not sorted and its not BST.


TC O(n); sc O(n);


public class Solution
{
    //Function to check whether a Binary Tree is BST or not.
    boolean isBST(Node root)
    {
        ArrayList<Integer>ans = new ArrayList<>();
        inorder(root,ans);
        for(int i=0; i<ans.size()-1; i++){
            if(ans.get(i)>ans.get(i+1)){
                return false;
            }
        }     
        return true;
    }
    void inorder(Node root, ArrayList<Integer>ans){
        if(root==null) return;
        inorder(root.left,ans);
        ans.add(root.data);
        inorder(root.right,ans);
    }
}


2nd approach something like.
min elment and max element.
if min element less then root and max element greater then root. then its ok.
keep moving if not then return false.


public class Solution
{
    //Function to check whether a Binary Tree is BST or not.
    boolean isBST(Node root)
    {
       // appraoch something max Starting point and Ending point.
       
       return isValid(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    boolean isValid(Node root, int start , int end){
        if(root==null) return true;
        
        if(start<root.data && end>root.data){
            return isValid(root.left,start,root.data) && isValid(root.right,root.data,end);  
        }
        
        return false;
    }
}



Given the root of a binary tree. Check whether it is a BST or not.
Note: We are considering that BSTs can not contain duplicate Nodes.
A BST is defined as follows:

The left subtree of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.
 

Example 1:

Input:
   2
 /    \
1      3
Output: 1 
Explanation: 
The left subtree of root node contains node
with key lesser than the root nodes key and 
the right subtree of root node contains node 
with key greater than the root nodes key.
Hence, the tree is a BST.
Example 2:

Input:
  2
   \
    7
     \
      6
       \
        5
         \
          9
           \
            2
             \
              6
Output: 0 
Explanation: 
Since the node with value 7 has right subtree 
nodes with keys less than 7, this is not a BST.
Your Task:
You don't need to read input or print anything. Your task is to complete the function isBST() which takes the root of the tree as a parameter and returns true if the given binary tree is BST, else returns false. 

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(Height of the BST).

Constraints:
0 <= Number of edges <= 100000