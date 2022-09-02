class Solution {
    public int lastIndex( String s) {

        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i)=='1'){
              return i;
            }
        }
        return -1;
    }
}



 int i,index=-1;
       for(i=0; i<s.size(); i++)
       if(s[i]=='1') index=i;
       return index;
       
       
