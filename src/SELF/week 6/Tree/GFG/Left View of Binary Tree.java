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
      if(root==null) return new ArrayList<>();
      LinkedList<Node> que = new LinkedList<>();
      ArrayList<Integer> ans = new ArrayList<>();
      
      que.addLast(root);
      while(que.size()>0){
          int size = que.size();
          for(int i=0; i<size; i++){
              Node curr = que.removeFirst();
              if(i==0){
                  ans.add(curr.data);
              }
              if(curr.left!=null) que.addLast(curr.left);
              if(curr.right!=null) que.addLast(curr.right);
          }
      }
      return ans;
    }
}



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