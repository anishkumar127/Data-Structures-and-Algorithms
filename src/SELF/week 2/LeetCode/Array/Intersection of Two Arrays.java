// 4-6 ms 
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        HashSet<Integer>set = new HashSet<>();
        for(int i:nums1){
            set.add(i);
        }
        
        HashSet<Integer> intersection = new HashSet<>();
        
        for(int i:nums2){
            if(set.contains(i)){  // if set1 contains that i value then we will add on intersection.
                intersection.add(i);
            }
        }
        
        int [] result = new int[intersection.size()];
        int index =0; // cursor
        for(int i: intersection){
            result[index++]=i;
        }
        return result;
    }
}





Time Complexity = O(N*M), Space Complexity = O(N)
where N = nums1.length, M = nums2.length
-> Using HashSet and Array

public int[] intersection(int[] nums1, int[] nums2) {
    HashSet<Integer> set = new HashSet();  
    
    for(int itr = 0; itr < nums1.length; itr++){
        for(int jtr = 0; jtr < nums2.length; jtr++){
            if(nums1[itr] == nums2[jtr]){
                set.add(nums1[itr]);
                break;
            }
        }
    }
    
    int[] arr = new int[set.size()];        
    int jtr = 0;
    for (int itr : set)  
        arr[jtr++] = itr; 
    
    return arr;
}





Several Java solutions with explanation


Solution using Java Collections

Convert first array to the set

Convert second array to the set

Use retainAll to find set intersection

Convert intersection set to array

// O(max(n, m)) time, O(n + m) space
public int[] intersection(int[] nums1, int[] nums2) {
  Set<Integer> a = new HashSet<>(Arrays.stream(nums1).boxed().collect(Collectors.toList()));
  Set<Integer> b = new HashSet<>(Arrays.stream(nums2).boxed().collect(Collectors.toList()));
  a.retainAll(b);
  return a.stream().mapToInt(Integer::intValue).toArray();
}
Solution sing sorting

Sort first array

Sort second array

Use two pointers to traverse first and second sorted arrays

If first pointer points to bigger value - move the second pointer

If second pointer points to bigger value - move the first pointer

If pointers point to equal values add it to result array and move both pointers to the next distinct value

Repeate 4-6 until any pointer reaches the end of array

Shrink the size of intersection array to remove unused space

// O(max(n, m) log max(n, m)) time, O(min(n, m)) space
public int[] intersection(int[] nums1, int[] nums2) {
  Arrays.sort(nums1);
  Arrays.sort(nums2);
  int[] intersect = new int[Math.min(nums1.length, nums2.length)];
  int i = 0;
  for (int p1 = 0, p2 = 0; p1 < nums1.length && p2 < nums2.length;) {
    while (p1 < nums1.length && nums1[p1] < nums2[p2]) {
      p1++;
    }
    while (p1 < nums1.length && p2 < nums2.length && nums1[p1] > nums2[p2]) {
      p2++;
    }
    if (p1 < nums1.length && p2 < nums2.length && nums1[p1] == nums2[p2]) {
      intersect[i++] = nums1[p1];
      while (p1 < nums1.length && nums1[p1] == intersect[i-1]) {
          p1++;
      }
      while (p2 < nums2.length && nums2[p2] == intersect[i-1]) {
          p2++;
      }
    }
  }                
  int[] result = new int[i];
  for (; i-1 >= 0; i--) {
    result[i-1] = intersect[i-1];
  }
  return result;
}
Brute-force solution

For each element in first array traverse second array

While traversing second array check for values match

If there is a match check if it is unique by traversing intersection array

If match is unique add it to intersection array.

Shrink intersection array

// nums1.length = n, nums2.length = m
// O (n * m * min(n, m)) time, O(min(n, m)) space
public int[] intersection(int[] nums1, int[] nums2) {
  int[] intersect = new int[Math.min(nums1.length, nums2.length)];
  int index = 0;
  for (int i = 0; i < nums1.length; i++) {
    for (int j = 0; j < nums2.length; j++) {
      if (nums1[i] == nums2[j]) {
        boolean isUnique = true;
        for (int k = 0; k < index; k++) {
          if (nums1[i] == intersect[k]) {
            isUnique = false;
          }
        }
        if (isUnique) {
          intersect[index++] = nums1[i];   
        }
      }
    }
  }
  int[] result = new int[index];
  for (; index-1 >= 0; index--) {
    result[index-1] = intersect[index-1];
  }
  return result;
}



Solution no.2 - Using BinarySearch
	public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Set<Integer> intersection = new HashSet<>();
        for(int num: nums2){
            if(binarySearch(num, nums1))
                intersection.add(num);
        }
        int[] result = new int[intersection.size()];
        int i = 0;
        for(int num: intersection){
            result[i] = num;
            i++;
        }
        return result;
    }
    
    public boolean binarySearch(int target, int[] nums){
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid] == target)
                return true;
            else if(nums[mid] > target){
                end = mid - 1;
            }else 
                start = mid + 1;
        }
        return false;
    }

	Solution no.3 - Using Two Pointer Approach
	public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        Set<Integer> intersect = new HashSet<>();
        int i = 0;
        int j = 0;
        while(i< nums1.length && j<nums2.length){
            if(nums1[i] == nums2[j]){
                intersect.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i] < nums2[j])
                i++;
            else
                j++;
        }
        int[] result = new int[intersect.size()];
        int k = 0;
        for(int num: intersect){
            result[k] = num;
            k++;
        }
        return result;
    }



    Note: This is not so optimised solution. The only reason for posting this solution is for those who don't have a knowledge of Hashset and I'll recommend learning Hashset but for now you can also solve it using Brute force technique.

Java Solution:

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] temp = new int[1001];
        int count = 0;
        for (int num : nums1) {
            if (temp[num] != 1) {
                temp[num] = 1;
            }
        }
        for (int num : nums2) {
            if (temp[num] == 1) {
                temp[num] = 2;
                count++;
            }
        }
        
        int[] res = new int[count];
        int index = 0;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == 2) {
                res[index++] = i;
            }
        }
        return res;
    }
}


Solution 1: arrays are sorted / using sorting

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> list = new ArrayList<Integer>();
        int ptr1 = 0;
        int ptr2 = 0;

        while (ptr1 < nums1.length && ptr2 < nums2.length) {
            if (nums1[ptr1] < nums2[ptr2]) {
                ptr1 = goToNextValue(ptr1, nums1);
            } else if (nums1[ptr1] > nums2[ptr2]) {
                ptr2 = goToNextValue(ptr2, nums2);
            } else {
                list.add(nums1[ptr1]);
                ptr1 = goToNextValue(ptr1, nums1);
                ptr2 = goToNextValue(ptr2, nums2);
            }
        }

        int[] output = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            output[i] = list.get(i);
        }
        return output;
    }
    
    public int goToNextValue(int pointer, int[] array) {
        int prevValue = array[pointer];
        while (pointer < array.length  && array[pointer] == prevValue) {
            pointer++;
        }
        return pointer;
    }
}
Solution 2: arrys are sorted + binary search

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int[] smaller = nums1.length <= nums2.length ? nums1 : nums2;
        int[] larger = nums1.length > nums2.length ? nums1 : nums2;
        int lastNum = -1;
        
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int num: smaller) {
            if (num != lastNum && binarySearch(larger, num) ) {
                list.add(num);
            }
            lastNum = num;
        }

        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
    
    public boolean binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                return true;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
        
    }
}



// dp 


        int[] dp = new int[1001];
        
        for(int i : nums1){
            if(dp[i] == 0){
                dp[i]++;    
            }  
        }
        for(int i : nums2){
            if(dp[i] == 1){
                dp[i]++;    
            }
        }
        
        int[] res = new int[Math.min(nums1.length, nums2.length)];
        int index = 0;
        
        for(int i=0; i<dp.length; i++){
            if(dp[i] >1){
                res[index] = i;
                index++;
            }
        }
        
        return Arrays.copyOfRange(res, 0, index);
        



// theory part.

// intersection
// The intersection of two arrays is a list of distinct numbers which are present in both the 
// arrays. The numbers in the intersection can be in any order.

// distinct numbers
// In mathematics, a distinct number is a number that is not equal to another number in a set. For example,
//  the set of numbers 1, 2 comprises the two distinct numbers 1 and 2, which can be shown by 
//  assessing each number's individual qualities.


