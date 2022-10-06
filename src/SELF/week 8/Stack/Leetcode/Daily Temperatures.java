
//brute force
class Solution {
    public int[] dailyTemperatures(int[] nums) {
        
        int n = nums.length;
        
        int output[]  = new int[n];
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(nums[j]>nums[i]){
                   output[i] = j-i;
                    break;
                } 
            }
        }
        
        return output;
    }
}



// optimal
class Solution {
    public int[] dailyTemperatures(int[] nums) {
     
        Stack<Integer> st = new Stack<>();
        
        int n = nums.length;
        
        int output[]  = new int[n];
        for(int i=0; i<n; i++){
            while(!st.isEmpty()  && nums[st.peek()] < nums[i]){
                int prev  = st.pop();
                output[prev] = i-prev;
            }
                st.push(i);
        }
        
        return output;
    }
}