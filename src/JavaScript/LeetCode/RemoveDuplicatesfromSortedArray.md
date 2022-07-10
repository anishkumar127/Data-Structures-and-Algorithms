
Remove Duplicates from Sorted Array

 */
 ```
var removeDuplicates = function(nums) {
      let i = 0;
    for (let j = 0; j < nums.length; j++) {
        if (nums[j] != nums[i]) 
            // i=i+1;
            nums[++i] = nums[j];
    }
    return ++i;
};
```


The difference between i++ and ++i is the value of the expression.

The value i++ is the value of i before the increment. The value of ++i is the value of i after the increment.

Example:
```
var i = 42;
alert(i++); // shows 42
alert(i); // shows 43
i = 42;
alert(++i); // shows 43
alert(i); // shows 43
The i-- and --i operators works the same way.

```

```
var removeDuplicates = function(nums) {
     if(nums.length <= 1) {
        return nums.length;
    }
    var k = 1;
    for(var i = 1; i < nums.length; i++) {
        if(nums[i] != nums[i-1]){
            nums[k++] = nums[i];
        }
    }
    return k;
};
```

<!-- https://leetcode.com/anatolii841993/ -->


Since the array is already sorted, we can keep two pointers i and j, where i is the slow-runner while j is the fast-runner.
As long as nums[i] === nums[j], we increment j to skip the duplicate.
When we encounter nums[j] !== nums[i], the duplicate run has ended so we must copy its value to nums[i+1]. i is then incremented and we repeat the same process again until j reaches the end of array.
try to run this and see what's going on there:
```
const removeDuplicates = (nums) => {
  let i = 0;
  let j = 1
  
  // [1,2,3,3,4,4,5,5,5]
  for (; j < nums.length; j += 1) {
    console.log(`before: i -> ${i}; j -> ${j}, nums[i] -> ${nums[i]}`);
    
    if (nums[i] !== nums[j]) {
      i += 1;
      nums[i] = nums[j];
    }
    
    console.log(`after: i -> ${i}; j -> ${j}, nums[i] -> ${nums[i]}`);
    console.log('---------------');
  }
  
  console.log('nums', nums);
  
  return i + 1;
};
```