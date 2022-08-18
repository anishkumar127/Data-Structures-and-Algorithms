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