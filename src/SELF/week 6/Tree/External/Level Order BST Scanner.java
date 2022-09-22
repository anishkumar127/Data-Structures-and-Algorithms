import java.util.*;

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
  public static void leverOrder(Node root){
        if(root==null) return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        // q.add(null); // its we will use for print level order. for next line printing. level by level. not single line.

    while(!q.isEmpty()){
        Node curr = q.remove();
        if(curr==null){  
            System.out.println();
            if(q.isEmpty()){  
                break;
            }else{    
                q.add(null);
            }
        }else{  
            System.out.print(curr.data+" "); 
           
            if(curr.left!=null) q.add(curr.left);
            if(curr.right!=null) q.add(curr.right);

        }
    }
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
       Node root = null;

      int n = sc.nextInt();
      int[] arr= new int[n];
      
      for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
      }
      for(int i=0; i<n; i++){
        root = insert(root,arr[i]);
      }
        leverOrder(root);
        System.out.println();
    }
}



REE LEVEL ORDER TRAVERSAL
You are given the number of nodes present in the tree. You have to input the nodes and form a Binary Search Tree (BST). After forming the BST, print the Level Order traversal of the BST.

Input
Line 1 contains integer n denoting number of nodes.

Line 2 contains n spaced integers denoting node values.

Output
Print a single line of space separated integers denoting Level Order traversal of tree.

Constraints
1<=n<=500

-1000<=value of node<=1000

Sample Input
6

1 2 5 3 4 6
Sample Output
1 2 5 3 6 4
Explanation
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
We need to print the nodes level by level. We process each level from left to right.

Level Order Traversal: 1 -> 2 -> 5 -> 3 -> 6 -> 4.