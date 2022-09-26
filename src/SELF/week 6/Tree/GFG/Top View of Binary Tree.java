
class Solution
{
    //Function to return a list of nodes visible from the top view 
    //from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root)
    {
        TreeMap<Integer,Integer> tmap = new TreeMap<>();
        levelOrder(root,0,tmap);
        ArrayList<Integer> ans = new ArrayList<>(tmap.values());
        
        return ans;
        
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
}

