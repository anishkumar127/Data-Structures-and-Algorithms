https://www.hackerrank.com/challenges/tree-top-view/problem?isFullScreen=true
/* 
    
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static void topView(Node root) {
        
        TreeMap<Integer,Integer> tmap = new TreeMap<>();
        levelOrder(root,0,tmap);
        List<Integer> ans = new ArrayList<>(tmap.values());
        
        for(int values:ans){
            System.out.print(values+" ");
        }
      
    }
    static void levelOrder(Node root, int index ,TreeMap<Integer,Integer>tmap){
         Queue<Node> que = new LinkedList<>();
         Queue<Integer> lines = new LinkedList<>();
         que.add(root);
         lines.add(0);
        while(que.size()>0){
            Node curr = que.poll();
            int idx = lines.poll();
            
            if(!tmap.containsKey(idx)){
               tmap.put(idx, curr.data);
            }
             
            if(curr.left!=null){
                que.add(curr.left);
                lines.add(idx-1);
            }
            if(curr.right!=null){
                que.add(curr.right);
                lines.add(idx+1);
            }
        }
    }



Given a pointer to the root of a binary tree, print the top view of the binary tree.

The tree as seen from the top the nodes, is called the top view of the tree.

For example :

   1
    \
     2
      \
       5
      /  \
     3    6
      \
       4
Top View : 

Complete the function  and print the resulting values on a single line separated by space.

Input Format

You are given a function,

void topView(node * root) {

}
Constraints

 Nodes in the tree  

Output Format

Print the values on a single line separated by space.

Sample Input

   1
    \
     2
      \
       5
      /  \
     3    6
      \
       4
Sample Output

1 2 5 6

Explanation

   1
    \
     2
      \
       5
      /  \
     3    6
      \
       4
From the top, only nodes  are visible.