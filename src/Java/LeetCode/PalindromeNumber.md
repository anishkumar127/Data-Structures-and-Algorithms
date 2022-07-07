
                   <!-- 1 -->
                   
<!-- https://leetcode.com/problems/palindrome-number/discuss/5472/What's-the-meaning-of-no-extra-space-(JAVA) -->

class Solution {
    public boolean isPalindrome(int x) {
        
        int temp = x;
        int sum = 0;
        
        while(x>0){
            int t = x%10;
            sum = (sum*10)+t;
            x = x/10;
        }
        if(temp==sum){
            return true;
        }else
        {
            return false;
        }
        
    }
}


                        <!-- 2 -->
<!-- Time complexity: O(logN)
Space complexity: O(1)
 -->

class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0, y = x;
        while (y > 0) {
            rev = rev * 10 + y % 10;
            y /= 10;
        }
        return rev == x;
    }
}


                    <!-- 3 -->


 public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int ans = 0;
        int num = x;
        while ( num > 0) {
            ans = ans * 10 + num % 10;
            num = num / 10;
        }
        if (ans != x) return false;
        return true;
    }



<!-- 4 -->




Java, math (no string) solution 

class Solution {
    public boolean isPalindrome(int x)
    {
        int reversed = 0;
        for (int i = x; i > 0; i /= 10)
            reversed = reversed * 10 + i % 10;
        return reversed == x;
    }
}


<!-- 5 -->
 <!-- no string conversion -->

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x < 10) return true;
        int y = x, result = 0;
        while (y > 0){
            result = result*10 + y % 10;
            y = y/10;
        }
        return result == x;
    }
}


