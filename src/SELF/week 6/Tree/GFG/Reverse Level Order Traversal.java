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
// 1 3  3 2 1 
class Tree
{
    public ArrayList<Integer> reverseLevelOrder(Node root) 
    {
     
      ArrayList<Integer> ans = new ArrayList<>();
      if(root == null) return ans;
      Queue<Node> q = new LinkedList<>();
      Stack<Integer> st = new Stack<>();
      q.offer(root);
      
      while(!q.isEmpty()){
          int n = q.size();
          for(int i=0; i<n; i++){
              Node curr = q.poll();
              st.push(curr.data);
           
              if(curr.right!=null) q.offer(curr.right);
              if(curr.left!=null) q.offer(curr.left);
          }
      }
      
      while(!st.isEmpty()) ans.add(st.pop());
      return ans;
    }
  
}      



// above code just trick.
// push into stack. and root push first and then right push then left push.
// when pop order while be. left right root. 



2nd method.
class Tree
{
    public ArrayList<Integer> reverseLevelOrder(Node root) 
    {
     
      ArrayList<Integer> ans = new ArrayList<>();
      if(root == null) return ans;
      Queue<Node> q = new LinkedList<>();
      q.offer(root);
      
      while(!q.isEmpty()){
          int n = q.size();
          for(int i=0; i<n; i++){
              Node curr = q.poll();
              ans.add(curr.data);
           
              if(curr.right!=null) q.offer(curr.right);
              if(curr.left!=null) q.offer(curr.left);
          }
      }
    Collections.reverse(ans);
      return ans;
    }
  
}      


// above code. push into list.
// first push root. then push right. then left.
// root right left,   1 2 3.
// when we reverse array list.  become. 3 2 1 . 








Given a binary tree of size N, find its reverse level order traversal. ie- the traversal must begin from the last level.

Example 1:

Input :
        1
      /   \
     3     2

Output: 3 2 1
Explanation:
Traversing level 1 : 3 2
Traversing level 0 : 1
Example 2:

Input :
       10
      /  \
     20   30
    / \ 
   40  60

Output: 40 60 20 30 10
Explanation:
Traversing level 2 : 40 60
Traversing level 1 : 20 30
Traversing level 0 : 10

Your Task: 
You dont need to read input or print anything. Complete the function reverseLevelOrder() which takes the root of the tree as input parameter and returns a list containing the reverse level order traversal of the given tree.


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)


Constraints:
1 ≤ N ≤ 10^4

