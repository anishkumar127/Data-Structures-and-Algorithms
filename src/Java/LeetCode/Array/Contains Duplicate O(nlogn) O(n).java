//                                                  1
// sorting Time Complexity = BigO(NlogN) as we are sorting

// Space Complexity= BigO(1) as no memory used

class Solution {
    public boolean containsDuplicate(int[] nums) {
       Arrays.sort(nums);
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] ==nums[i+1]){
                return true;
            }
}
        return false;
        
    }
}

                                            // 2
// Runtime: 10 ms, faster than 73.88% 
// time complexity O(n) space companxity O(n);  if all elements are unique then space complexity increase O(n);
                                            
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hash = new HashSet<>();
        for(int i=0; i<nums.length;i++){
            if(hash.contains(nums[i])){
                return true;
            }
            hash.add(nums[i]);
        }
        return false;
    }
}

                                                //3

// Runtime: 8 ms, faster than 85.68% 
// simple and short code.

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums){
            if(!set.add(n)){  // if anything set not add. then its means this array contains duplicate elements.
                return true;
            }
        }
        return false;
    }
}

                                        // 4
/*approach 4: using XOR property A^A=0 and 0^A=A
 * TC: O(n^2) SC: O(1)
 * */
public boolean containsDuplicateApproach4(int[] nums) {
    for(int i=0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
            if((nums[i]^nums[j])==0){
                return true;
            }
        }
    }
    return false;
}



                                        // 5
/*approach 5: add elements to the map. if map frequency is greater then 1 return true
 * TC: O(n) SC: O(n)
 * */
public boolean containsDuplicateApproach3(int[] nums) {
    Map<Integer,Integer> map = new HashMap<>();
    for(int i=0;i<nums.length;i++){
        if(map.containsKey(nums[i])){
            return true;
        } else{
            map.put(nums[i],1);
        }
    }
    return false;
}