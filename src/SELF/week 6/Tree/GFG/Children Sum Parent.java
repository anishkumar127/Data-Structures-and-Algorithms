Node is as follows:
class Node{
	int data;
	Node left,right;
	
	Node(int key)
	{
	    data = key;
	    left = right = null;
	}
}

*/
class Tree
{
    //Function to check whether all nodes of a tree have the value 
    //equal to the sum of their child nodes.
    public static int isSumProperty(Node root)
    {
       if(root==null) return 1;
       if(root.left==null && root.right==null) return 1;
       
       int sum =0;
       if(root.left!=null){
           sum+=root.left.data;
       }
       if(root.right!= null){
           sum+=root.right.data;
       }
       if(root.data==sum){
           return isSumProperty(root.left) & isSumProperty(root.right);
       } 
       
       return 0;
       
        
    }
}



class Tree

{

    public static int isSumProperty(Node root)

    {

        if(root==null || (root.left==null && root.right==null)){

            return 1;

        }

        int left = 0, right = 0;

        if(root.left!=null){

            left = root.left.data;

        }

        if(root.right!=null){

            right = root.right.data;

        }

        if(left+right==root.data && isSumProperty(root.left)==1 && isSumProperty(root.right)==1){

            return 1;

        }

        return 0;

    }

}



public static int isSumProperty(Node root)
   {
       // add your code here
       Queue <Node> q=new LinkedList<Node>();
       if(root==null){
           return 0;
       }
       
       q.add(root);
       
       while(!q.isEmpty()){
           int s=q.size();
           for(int i=0;i<s;i++){
               Node curr=q.poll();
               int sum=0;
               
               if(curr.left!=null){
                   sum+=curr.left.data;
                   q.add(curr.left);
               }
               if(curr.right!=null){
                   sum+=curr.right.data;
                   q.add(curr.right);
               }
               if(curr.left==null && curr.right==null){
                   continue;
               }
               if(sum!=curr.data){
                   return 0;
               }
           }
       }
       return 1;
   }
   
   
   
   Given a Binary Tree. Check whether all of its nodes have the value equal to the sum of their child nodes.


Example 1:

Input:
     10
    /
  10 
Output: 1
Explanation: Here, every node is sum of
its left and right child.
Example 2:

Input:
       1
     /   \
    4     3
   /  \
  5    N
Output: 0
Explanation: Here, 1 is the root node
and 4, 3 are its child nodes. 4 + 3 =
7 which is not equal to the value of
root node. Hence, this tree does not
satisfy the given conditions.

Your Task:
You don't need to read input or print anything. Your task is to complete the function isSumProperty() that takes the root Node of the Binary Tree as input and returns 1 if all the nodes in the tree satisfy the following properties. Else, it returns 0.
For every node, data value must be equal to the sum of data values in left and right children. Consider data value as 0 for NULL child.  Also, leaves are considered to follow the property.


Expected Time Complexiy: O(N).
Expected Auxiliary Space: O(Height of the Tree).

 

Constraints:
1 <= N <= 105
1 <= Data on nodes <= 105
