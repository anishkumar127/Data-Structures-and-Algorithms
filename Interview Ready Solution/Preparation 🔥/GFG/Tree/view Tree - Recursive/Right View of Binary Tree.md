```java
/*Complete The Function Provided
Given Below is The Node Of Tree
class Node
{
    int data;
    Node left, right;
    public Node(int data)
    {
        this.data = data;
         left = right = null;
    }
}*/


class Solution{
    //Function to return list containing elements of right view of binary tree.
    ArrayList<Integer> rightView(Node root) {
  ArrayList<Integer>ans = new ArrayList<>();
     if(root==null) return ans;
     
     reversePreOrder(root,0,ans);
     return ans;
    }
    private void reversePreOrder(Node root, int level, ArrayList<Integer>ans){
        if(root==null)return;
        if(level==ans.size()){
            ans.add(root.data);
        }  
            reversePreOrder(root.right,level+1,ans);
            reversePreOrder(root.left,level+1,ans);
     
    }
}
```

Given a Binary Tree, find Right view of it. Right view of a Binary Tree is set of nodes visible when tree is viewed from right side.

Right view of following tree is 1 3 7 8.

          1
       /     \
     2        3
   /   \      /    \
  4     5   6    7
    \
     8

Example 1:

Input:
       1
    /    \
   3      2
Output: 1 2
Example 2:

Input:
     10
    /   \
  20     30
 /   \
40  60 
Output: 10 30 60
Your Task:
Just complete the function rightView() that takes node as parameter and returns the right view as a list. 

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(Height of the Tree).

Constraints:
1 ≤ Number of nodes ≤ 105
1 ≤ Data of a node ≤ 105