binary search.
class Solution {
    public boolean isPerfectSquare(int num) {
     int start =1;
        int end = num;
        while(start<=end){
           long  mid = start+(end-start)/2;
            
            if(mid*mid==num){
                return true;
            }else if(mid*mid>num){
                end =(int) mid-1;
            }else{
                start = (int)start+1;
            }
        }
        return false;
    }
}


// for loop not binary search

class Solution {
    public boolean isPerfectSquare(int num) {
       int i ;
        int rem = num%10;
        if(rem==2 || rem == 3 || rem == 7 || rem == 8){
            return false;
        }
        
        for( i=1; i*i<num; i++);
            
        return (i*i==num);
    }
}


Given a positive integer num, write a function which returns True if num is a perfect square else False.

Follow up: Do not use any built-in library function such as sqrt.

 

Example 1:

Input: num = 16
Output: true
Example 2:

Input: num = 14
Output: false
 

Constraints:

1 <= num <= 2^31 - 1