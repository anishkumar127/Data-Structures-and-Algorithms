

var majorityElement = function(nums) {
      nums.sort((a,b) => a - b);
    return nums[Math.floor(nums.length/2)];
};



var majorityElement = function(nums) {
     
    // Boyer-Moore Voting Algorithm
    
    let count = 0, candidate = 0
    
    for (let num of nums) {
        if (count == 0) {
            candidate = num
        }
        count += num == candidate ? 1 : -1
    }
    
    return candidate
};


var majorityElement = function(nums) {
     
     let map = {}
    
    for(let num of nums) {
        map[num] = map[num] ? map[num] + 1 : 1
    }

    for (const key in map) {
        if (map[key] > nums.length / 2 ) {
            return key
        }      
    }
};


<!-- O(1) space and O(n) Time -->


  let len=nums.length;
    let count=0;
    let major=0;
    for(i=0;i<len;i++){
        if(count==0){
            count++;
            major=nums[i]
        }else if(major==nums[i]){
            count++;
        }else{
            count--;
        }
    }
    return major;


<!-- O(1) space and O(n) Time -->

var majorityElement = function(nums) {
     
 let count = 0
let candidate = null
for(let i=0;i<nums.length;i++){
        if(count==0){
            candidate=nums[i]
        }
        count+=(candidate==nums[i])?1:-1
}
return candidate

};