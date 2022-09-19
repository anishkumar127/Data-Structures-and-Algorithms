
/// one test case not working.

class Solution
{
    public int TotalPairs(int[] nums, int k)
    {
        // case 1.
      if(k==0){
          HashMap<Integer,Integer> map = new HashMap<>();
          int ans = 0;
      for(int i=0; i<nums.length; i++){
          map.put(nums[i],map.getOrDefault(nums[i],0)+1);
      }
      
      for(int i=0; i<nums.length; i++){
          int num = nums[i];
          if(map.get(num)>1){ // frequncy greater than should be 1 or 2 or something. but its should be greater than 1. 
              ans+=1;   // if multiple 1 1 1 1 and frequency is 4. so we just need only 1. 
              map.put(num,0); // and after put frequncy is 0. because 1 occur 4 times. and is actaully 1.
              // if we don't do 0 frequency.. its 1 1 1 1 . it will count over and over. we don't need this.
          }
      }
      return ans;
          
      }else{
        //   k is not equal to 0. or k is something. so we do complymentry. 
        
         HashSet<Integer> set = new HashSet<>();
         for(int i=0; i<nums.length; i++){
             set.add(nums[i]);
         }
         int ans =0;
         for(int i=0; i<nums.length; i++){
             int num = nums[i];
             int comp = num-k;  // or num-k anyting + or - its complimentry.
             if(set.contains(comp)){
                 ans= ans+1;
             }
         }
         return ans;
      }
      
    }
}