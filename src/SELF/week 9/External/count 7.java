import java.util.*;
class Main{
	public static void main(String[] args){
		try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            int res = new Solution().count7(n);
		    System.out.println(res);
		}
	}

}
class Solution {
    public int count7(int n) {
        //Write Code here
             int k =7;
      
      int count =0;
      while(n>0){
        int digit = n%10;
        if(digit==k) count++;
        n= n/10;
      }
            return count;
    }
}



// scanner

import java.util.*;

public class Main {
    public static void main(String[] args) {
      // 27727
      
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k =7;
      
      int count =0;
      while(n>0){
        int digit = n%10;
        if(digit==k) count++;
        n= n/10;
      }
      
      System.out.println(count);
      
  }
}



Given a number N.

Your task is to find the number of 7 in the number.

Input Format:
The first line contains an integer 'N' denoting the number.

Output Format:
For each test case return a number, denoting number of 7 in the given number.

Example 1:
Input:

27727
Output:

3
Explanation:

There are 3 7 in the number.

Example 2:
Input:

17245
Output:

1
Explanation:

There are 1 7 in the number.

Constraints:
1 <= N <= 1000000000