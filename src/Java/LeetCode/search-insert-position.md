https://leetcode.com/problems/search-insert-position/

Runtime: 0 ms, faster than 100.00%

class Solution {
    public int searchInsert(int[] nums, int target) {
        int index =0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==target){
               index =i;
            }else if(nums[i]<target){
                 index = i+1;    
            }
        }
        return index;
    }
}


int low = 0, high = A.length;
while(low<high) {
	mid=low+(high-low)/2; // low<=mid, mid<high
	if (nums[mid]>=target) high=mid; // high always decreases (even high-low==1)
	else low=mid+1; // low always increases
}
return low;


class Solution {
    public int searchInsert(int[] arr, int target) {
        
        int lo = 0, hi = arr.length-1;
        
        while(lo<=hi){
            
            int mid = lo+(hi-lo)/2;
            
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                lo = mid+1;
            }
            else{
                hi = mid-1;
            }
        }
        return lo;
    }
}


/**
 * Optimized Binary Search w/ Early Exits
 *
 * We are trying to find the index of number equal to target or index of number
 * just larger than target.
 *
 * Time Complexity: O(log N)
 *
 * Space Complexity: O(1)
 *
 * N = Length of the input array.
 */
class Solution {
    public int searchInsert(int[] nums, int target) {
        if (nums == null) {
            throw new IllegalArgumentException("Input array is null");
        }

        int len = nums.length;
        if (len == 0 || target <= nums[0]) {
            return 0;
        }
        if (target == nums[len - 1]) {
            return len - 1;
        }
        if (target > nums[len - 1]) {
            return len;
        }

        /*
         * Here the search space is from 0 to len. Since we have already handled 0 and
         * len in above base conditions, we can reduce the search space to 1 -> len-1.
         */
        int start = 1;
        int end = len - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (target == nums[mid]) {
                return mid;
            }
            if (target < nums[mid]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }
}


class Solution {
    public int searchInsert(int[] nums, int target) {

        for(int i=0;i<nums.length;i++){
            if(nums[i]==target) return i;  // this means the value is present and we will returen the index
            else if(nums[i]>target) return i;  // this mean the array value is more that target value and 
			//we havn'e found any match yet this mean the value is not present so we will put target 
			//value in the index of its just greater value that is present at index i
        }
        return nums.length;// we have traversed the whole array and niether able to find the value,
		//nor the value greater then it i.e. target will be added at the end end so return nums.length

    }
}


class Solution {
    public int searchInsert(int[] nums, int target) {
       int i=0;
        while(i<nums.length && nums[i] < target){
            i++;
        }
        return i;
    }
}

O(n)
class Solution {
    public int searchInsert(int[] nums, int target) {
        int c = 0;
        for (int num : nums) {
            if (num < target) {
                c++;
            } else {
                break;
            }
        }
        return c;
    }
}


O(logN)
public class Solution {
    public int searchInsert(int[] A, int target) {
        
        if(A.length == 0)return 0;
        
        int left = 0, right = A.length - 1;
        int mid = 0;
        
        while(left <= right){
            
            if(target<A[left])return left;
            if(target>A[right])return right+1;
            
            mid = (left+right)/2;
            
            if(A[mid]==target)return mid;
            else if(target < A[mid]){
                right = mid-1;
            }else{
                left = mid +1;
            }
            
        }
        return -1;
        
        
    }
}


//cpp

class Solution {
public:
    int searchInsert(vector<int>& a, int tgt) {
        
        int lo=0,         hi=a.size()      ,mid;
        while(lo<hi)
        {
            mid =  (hi+lo)/2; 
            (a[mid]>=tgt) ?     hi = mid :    lo = mid+1;
        }
        return lo;        
    }
};



