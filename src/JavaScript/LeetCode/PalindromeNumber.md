<!-- it has O(n*n) complexity because of shift()  -->
```
var isPalindrome = function(x) {
    
     const arr = String(x).split('');
        
    while (arr.length > 1) {
        if (arr.shift() !== arr.pop()) {
            return false;
        }
    }
    
    return true;
};
```

<!-- 
This may not be the idle interview way to answer this question but just wanted to share the beauty(?) of JS -->
```
var isPalindrome = function (x) {
  return x.toString() === x.toString().split("").reverse().join("");
};



var isPalindrome = function(x) {
if(x < 0) return false;
    let rev = 0
    let n = x
    while(n){
      let last = n%10
     rev = rev*10 + last
     n = Math.floor(n/10)
}
    return  rev === x
};

```

```
var isPalindrome = function(x) {
 let str = x.toString();
    let l = 0, r = str.length-1;
     while (l < r) {
        if (str[l] === str[r]) l++, r--;
        else return false;
    }
    return true;
};

```


<!-- https://leetcode.com/problems/palindrome-number/discuss/1223900/Java-oror-99-Faster-than-others-oror-Optimized-code -->

 <!-- two pointers -->
 ```
var isPalindrome = function(x) {
 if (x < 0) {
    return false;
  }
  
  let char = x.toString();
  let i = 0;
  let j = char.length - 1;
  
  while (i <= j) {
    if (!(char[i++] === char[j--])) {
      return false;
    }
  }
  
  return true;
};
```