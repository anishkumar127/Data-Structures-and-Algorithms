class Solution
{
    //Function to find the first position with different bits.
    public static int posOfRightMostDiffBit(int m, int n)
    {
            
      if(m == n) return -1;
      int count  =1;
      while((m&1)==(n&1)){
          m= m>>1;
          n = n>>1;
          count++;
      }
            return count;
    }
}

class Solution
{
    //Function to find the first position with different bits.
    public static int posOfRightMostDiffBit(int m, int n)
    {
            
      if(m == n) return -1;
      int count  =1;
      int xor = m^n;
    
    while(xor>0){
        if((xor&1 )!=0){
            return count;
        }
        count++;
        xor = xor>>1;
    }
            return count;
    }
}




Given two numbers M and N. The task is to find the position of the rightmost different bit in the binary representation of numbers.

Example 1: 

Input: M = 11, N = 9
Output: 2
Explanation: Binary representation of the given 
numbers are: 1011 and 1001, 
2nd bit from right is different.
Example 2:

Input: M = 52, N = 4
Output: 5
Explanation: Binary representation of the given 
numbers are: 110100 and 0100, 
5th-bit from right is different.
User Task:
The task is to complete the function posOfRightMostDiffBit() which takes two arguments m and n and returns the position of first different bits in m and n. If both m and n are the same then return -1 in this case.

Expected Time Complexity: O(max(log m, log n)).
Expected Auxiliary Space: O(1).

Constraints:
0 <= M <= 109
0 <= N <= 109




brute force

public static int posOfRightMostDiffBit(int m, int n)

    {
        int q=m^n;

        int x=0;

        String s=Integer.toBinaryString(q);

        for(int i=s.length()-1; i>=0; i--){

            x++;

            if(s.charAt(i)=='1')

            return x;

        }

         return -1;   

    }
    
    
    
    naïve approach
    class Solution

{

    //Function to find the first position with different bits.

    public static int posOfRightMostDiffBit(int m, int n)

    {   // Your code here 

        int position=1;

        int r1=0,r2=0;

        while(m>0 || n>0)

        {

            r1 = m%2;

            r2 = n%2;

            if(r1!=r2)

            {

                return position;

            }

            m=m/2;

            n=n/2;

            position++;

        }

        return -1;

    }

}


class Solution
{
   public:
   //Function to find the first position with different bits.
   int posOfRightMostDiffBit(int m, int n)
   {
       // Your code here
       if(m==n)
       return -1;
       
       int count =1;
       
       while(n>0 || m>0)
       {
           int m1=m&1;
           int m2=n&1;
           
           if(m1 != m2)
           return count;
           
               count++;
               m=m>>1;
               n=n>>1;
               
           }
           return count;
           
       }
};
//  both n and m should be greater than zero till we check(incrementation)
  than check for last digit whether it is same or not. If it is same than we have do
 incrementation and do it again and again untill we find different bits and than simply return the count and tada it's done
 
 
 