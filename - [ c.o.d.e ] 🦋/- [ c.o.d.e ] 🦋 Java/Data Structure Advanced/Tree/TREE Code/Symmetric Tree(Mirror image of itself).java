class GfG
{
    // return true/false denoting whether the tree is Symmetric or not
    public static boolean isSymmetric(Node root)
    {
        // add your code here;
        if(root ==null){
            return true;
        }
        return isMirror(root.left,root.right);
    }
    public static boolean isMirror(Node x, Node y){
        if(x==null && y==null){
            return true;
        }
        if(x==null || y==null ){
            return false;
        }
        if( x.data == y.data){
            // if( x!=null && y!=null && x.data == y.data){ // reduce time.
            return isMirror(x.left,y.right) && isMirror(x.right,y.left);
        }else{
            return false;
        }
    }
}

/*

Solving this question with the help of isMirror function makes it easier.

we will return isMirror of root,root.

If both the x and y are null then we will return true, as null node is symmetric by default. that will also be the base case of this recursion.

we will check that if both the nodes are similar and their data is also same. then in that case we will return isMirror(x→left, y→right) 
and isMirror(x→right, y→left) as both of them should hold simultaneously, 
in that case only we will be able to say for sure that the tree is a symmetric tree and nothing else.


Expected Time Complexity: O(N).
Expected Auxiliary Space: O(Height of the Tree).

Constraints:
0<=Number of nodes<=100


Example 1:

Input:
         5
       /   \
      1     1
     /       \
    2         2
Output: True
Explanation: Tree is mirror image of
itself i.e. tree is symmetric
Example 2:

Input:
         5
       /   \
      10     10
     /  \     \
    20  20     30
Output: False

*/