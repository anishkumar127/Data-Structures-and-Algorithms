```java

/* A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/
class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
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
            reversePreOrder(root.left,level+1,ans);
            reversePreOrder(root.right,level+1,ans);
    }
}
```

Given a Binary Tree, print Left view of it. Left view of a Binary Tree is set of nodes visible when tree is visited from Left side. The task is to complete the function leftView(), which accepts root of the tree as argument.

Left view of following tree is 1 2 4 8.

          1
       /     \
     2        3
   /     \    /    \
  4     5   6    7
   \
     8   

Example 1:

Input:
   1
 /  \
3    2
Output: 1 3

Example 2:

Input:

Output: 10 20 40
Your Task:
You just have to complete the function leftView() that returns an array containing the nodes that are in the left view. The newline is automatically appended by the driver code.
Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).

Constraints:
0 <= Number of nodes <= 100
1 <= Data of a node <= 1000