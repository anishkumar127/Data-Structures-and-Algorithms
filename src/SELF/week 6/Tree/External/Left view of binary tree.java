import java.util.*;
// 1 2 5 3 4 
public class Main {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static Node insert(Node root, int data){
        if(root==null){
            root=new Node(data);
            return root;
        }

        if(root.data>data){
            // left subtree
           root.left = insert(root.left,data);
        }else{
            root.right = insert(root.right,data);
        }
        return root;
    }
  public static void postOrder(Node root){
        if(root==null) return;
        
        postOrder(root.left);
        System.out.print(root.data+" ");
        postOrder(root.right);
  }
    public static Node InorderSuccessor(Node root){
        while(root.left!=null){
            root = root.left;
        }
        return root;
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Node root = null;
       int n = sc.nextInt();
       int values[] = new int [n];
       for(int i=0; i<n; i++){
         values[i] = sc.nextInt();
         root = insert(root,values[i]);
       }
        // postOrder(root);
        
         ArrayList<Integer>el=  leftView(root);
         for(int x:el){
           System.out.print(x+" ");
         }
    }
    
    private static ArrayList<Integer> leftView(Node root)
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



You are given the number of nodes present in the tree. You have to input the nodes and form a Binary Search Tree (BST).

After forming the BST, print Left view of it. Left view of a Binary Tree is set of nodes visible when tree is visited from Left side.

BST should be formed in way like:

Let us consider an array named Val having the values of the nodes. Here, Val[0] will the root of BST. Then, you have to insert Val[1] in the BST, then insert Val[2] in the BST and so on....

After forming the BST, print the top view of the BST.

Input
The first line contains an integer n, the number of nodes.
The next line inputs the value of n nodes.

Constraints:
1 <= n <= 500
-100 <= val[node] <= 100

Output
Print the left view of the tree as a single line of space-separated values.

Example
Input:
6
1 2 5 3 4 6
Output:
1 2 5 3 4 
Explanation:
The BST is like :-
     1
      \
       2
        \
         5
        /  \
       3    6
        \
         4  
So,the level order traversal of tree results in 1,2,5,3,4 as the required result.
