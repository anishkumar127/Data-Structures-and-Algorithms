import java.io.*;
import java.util.*;

class Solution{   
    public static int sumOfEvenDigits(Long N) { 
        //Write code here
            long sum =0;
            while(N>0){
                    long digit = N%10;
                    if(digit%2==0){
                            sum+=digit;
                    }
                    // System.out.print(sum);
                    N=N/10;
            }

            return (int)sum;
    }
}
class Main {   
	public static void main (String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
        long N=sc.nextLong();
        
        Solution ob = new Solution();
		int ans=ob.sumOfEvenDigits(N);    
        System.out.println(ans); // print the result
		
	}
}



Bob has been given a number N, he is asked to print the sum of all the even digit present in the number N. As Bob has less knowledge of programming, help Bob write the code for this problem.

Input Format
The first line of input conatins a single number N.

Output Format
Return the sum of all the even digit present in the number N.

Example 1
Input

123
Output

2
Explanation

2 is the only even digit present in the number 123.

Example 2
Input

2345
Output

6
Explanation

2 and 4 are the even digit present in the number 2345 so the sum is 2+4 that is 6.

Constraints
1 <= N <= 10^18