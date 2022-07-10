`` <-- nums = "----->-->"; k =3
result = "-->----->";

reverse "----->-->" we can get "<--<-----"
reverse "<--" we can get "--><-----"
reverse "<-----" we can get "-->----->"
this visualization help me figure it out :) --> ``

``Runtime: 1 ms, faster than 85.95%``

```
class Solution { // Java O(n) in-place solution
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums,0,nums.length-1); // reverse whole array
        reverse(nums,0,k-1); // reverse first part
        reverse(nums,k,nums.length-1); // reverse second part. 
        
    }
    public static int [] reverse(int nums[] , int start, int end){
    
        while(start<end){
            int temp =nums[start];
            nums[start]= nums[end];
            nums[end]= temp;
            start++;
            end--;
        }
    return nums;
    }
}

```

``.. XOR ``
```
class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
        
    }
    public static int [] reverse(int nums[] , int start, int end){
    
        while(start<end){
           nums[start] = nums[start] ^ nums[end];
            nums[end]  = nums[end] ^ nums[start];
            nums[start] = nums[start] ^ nums[end];
            start++;
            end--;
        }
    return nums;
    }
}
```
