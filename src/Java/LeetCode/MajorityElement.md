<!-- Boyer Moore votting  -->
class Solution {
    public int majorityElement(int[] nums) {
  
        int count = 0, candidate = 0;
      	for(int num: nums) {
		 if(count == 0) {
			 candidate = num;
		}
	    	if(num == candidate) {
			        count++;
		} else {
			count--;
		}
	}

	return candidate; 
    }
}


int res = nums[0];
    int count = 1;

    for (int num : nums) {
        if (res == num)
            ++count;
        else 
            --count;
    
        if (count == 0) {
            res = num;
            count = 1;
        }
    }

    return res;


<!-- 
Boyer Moore -->

   int count = 0;
    int cand = 0;
     for(int num : nums){
         if(count == 0){
             cand = num;
         }
         if(cand == num){
             count+=1;
         }
         else
             count-=1;
     }
    return cand;
    
}


	int n = nums.length;
    int element=0;
    int count=0;
    
    for(int i=0; i<n; i++){
        if(count==0){
            element = nums[i];
        }
        if(nums[i] == element){
            //some majority element
            count++;
        }
        else{
            //some minority element
            count--;
        }
    }
    return element;
}


<!-- It simply uses Moore's Voting Algo. -->

  int count = 0 ;
		int candidate = 0;


		for (int num : nums){
			if (count==0){
			   candidate = num;
			}
		  if(num==candidate) count++;
		  else count--;
		}
		return candidate;



<!-- 1. Using Divide and Conquer Runtime ~ 2 ms -->

class Solution {
    public int majorityElement(int[] nums) {
		//1. check by divide and conquer algo 
        return dAndC(nums, 0, nums.length - 1);
    }
    private int dAndC(int[] nums, int l, int r){
		//2. if left and right are equal: by default the element would return
        if (l == r)
            return nums[l];
        
		//3. calculate middle
        int mid = (r-l)/2 + l;
			// l = 0, r = 5 mid = 5-0/2 + 0 = 2
			//l = mid+1 = 3, r = 5 mid = 5-3/2 + 3 = 4
		
		//4. recurse through left and right
        int left = dAndC(nums, l, mid);
			//left starts at l and end at mid
        int right = dAndC(nums, mid+1, r);
			//right starts at mid+1 and ends at r
        
		//5. if both left & right equal: by default return one of them
        if (left == right)
            return left;
		
		// 6. If not equal: take counts each for both sides 
        int leftCount = 0;
        int rightCount = 0;
		
		//7. for loop to iterate through the complete set
        for(int i = l; i<= r; i++){
		
			//7.1. if nums value at i equal to left(already found at 4.): increase its count
            if (nums[i] == left)
                leftCount ++;
			//7.2 same as 7.1 if equals to right (already found at 4.)
            if (nums[i] == right)
                rightCount++;
        }
		//8. check both counts and return the one with higher count value
        return leftCount>rightCount? left: right;
    }
}
<!-- 2. Using HashMap Runtime ~ 10 ms -->

class Solution {
    public int majorityElement(int[] nums) {
	//1. find middle 
       int mid = nums.length/2;
	   //2. create Hashmap
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		//3. loop through the array
        for(int i = 0; i<nums.length; i++){
		//4. if map contains a key same as the element at i
            if(map.containsKey(nums[i])){
			//4.1. increase its value by 1
                map.put(nums[i], map.get(nums[i])+1);
            }
			//5. if not: insert the element to the map with keyValue as 1
            else
                map.put(nums[i], 1);
        }
		//6. initialize answer as 0
        int ans = 0;
		//7. check through the keys of the map
        for(int j: map.keySet()){
		//8. check for the key with value > mid
            if(map.get(j) > mid){
			//9. put that key to answer
                ans = j;
            }
        }
        return ans;
    }
}


<!-- 3. Using sorting Runtime ~ 5ms -->

class Solution {
    public int majorityElement(int[] nums) {
		//1. sort the array
        Arrays.sort(nums);
		//2. the elements with highest occurence shall by default fall around mid
			//> return that element
        return nums[nums.length/2];
        
    }
}

 <!-- Moore voting algorithm -->

public int majorityElement3(int[] nums) {
    int count=0, ret = 0;
    for (int num: nums) {
        if (count==0)
            ret = num;
        if (num!=ret)
            count--;
        else
            count++;
    }
    return ret;
}



public int majorityElement2(int[] nums) {
    Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();
    //Hashtable<Integer, Integer> myMap = new Hashtable<Integer, Integer>();
    int ret=0;
    for (int num: nums) {
        if (!myMap.containsKey(num))
            myMap.put(num, 1);
        else
            myMap.put(num, myMap.get(num)+1);
        if (myMap.get(num)>nums.length/2) {
            ret = num;
            break;
        }
    }
    return ret;
}



