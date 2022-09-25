/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var search = function(nums, target) {
        let n = nums.length;
        let s = 0;
        let e = n-1;
        while(s<=e){
            let mid = parseInt( s+(e-s)/2);    // Math.floor((s+e)/2); but math high run time.
            if(nums[mid]==target){
                return mid;
            }else if(target>nums[mid]){
                s=mid+1;
            }else{
                e = mid-1;
            }
        }
        return -1;
};