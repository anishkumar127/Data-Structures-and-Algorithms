/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    let n = nums.length;
    for(let i=0; i<n; i++){
        for(let j=i+1; j<n; j++){
            let sum = nums[i]+nums[j];
            if(sum==target){
                return[i,j];
            }
        }
    }
    return [];
};

