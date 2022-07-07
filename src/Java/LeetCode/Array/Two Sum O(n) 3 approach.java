

                                                    // 1.
// Runtime: 2 ms, faster than 93.55% 
// Time Complexity: O(N)

// Space Complexity: O(N)

class Solution {
    public int[] twoSum(int[] nums, int target) {
    
        int res[] = new int[2];
        Map <Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target - nums[i])){
                res[0] = map.get(target-nums[i]);
                res[1] = i;
                return res;
            }
            map.put(nums[i],i);
        }
        return res;
    }
}


                                                //2
// Runtime: 3 ms, faster than 89.79%

class Solution { // in this not required to do again and again check line by.
    public int[] twoSum(int[] nums, int target) {
    
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
      for(int i=0; i<nums.length; i++){
          int curr = nums[i];
          int required = target - curr;
          if(map.containsKey(required)){
              int reqIdx = map.get(required);
              return new int[] {i,reqIdx};
          }else{
              map.put(curr,i);
          }
      }
        return null;
    }
}

                                            //3
// Runtime: 4 ms, faster than 73.34% 

class Solution {
    public int[] twoSum(int[] nums, int target) {
    
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        for(int i=0; i<nums.length; i++){
            Integer required = (Integer) (target - nums[i]);
            if(map.containsKey(required)){
                int ans[] = {map.get(required),i};
                return ans;
            }
            map.put(nums[i],i); // value and index
}
        return null;
    }
}

