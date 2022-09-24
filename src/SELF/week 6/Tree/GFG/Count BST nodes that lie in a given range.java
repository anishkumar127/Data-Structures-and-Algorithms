class Solution
{
   
    int getCount(Node root,int l, int h)
    {
        int ans =0;
        if(root==null) return 0;
        
        ans+=getCount(root.left,l,h);
        if(root.data>=l&& root.data<=h){
            ans++;
        }
        ans+=getCount(root.right,l,h);
        
        return ans;
    }
}



class Solution
{
     int count=0;
    int getCount(Node root,int l, int h)
    {
        solve(root,l,h);
        return count;
    }
    private  void solve(Node root, int l, int h){
        if(root==null)return;
       
         solve(root.left,l,h);   // left call.
        
         if(root.data>=l && root.data<=h){
             count++;    
        }
          solve(root.right,l,h);  // right call
    }
}



//array list .

class Solution
{
      int getCount(Node root,int l, int h)
    {
        ArrayList<Integer> a = new ArrayList<>();
        al(root,a);
        
        int ans = 0;
       
        for (Integer i : a){
            if(i>=l && i<=h){
                ans++;
            }
        }
        
        return ans;
    }
    void al(Node root, ArrayList<Integer>a){
        if(root != null){
            al(root.left,a);
            a.add(root.data);
            al(root.right,a);
        }
 
    }
}
