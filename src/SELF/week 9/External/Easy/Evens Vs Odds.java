import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution.evensVsOdds(n);
    }
}
class Solution {
    static void evensVsOdds(int n) {
        //Your code here
             
   int odd =0;
   int even =0;
   for(int i=0; i<=n; i++){
     if(i%2==0){
       even+=i;
     }else{
       odd+=i;
     }
   }
   
   System.out.println((even-odd));
    }
}


import java.util.*;

public class Main {
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   
   int odd =0;
   int even =0;
   for(int i=0; i<=n; i++){
     if(i%2==0){
       even+=i;
     }else{
       odd+=i;
     }
   }
   
   System.out.println((even-odd));
  }
}

From a given number, subtract the sum of all odd numbers from the sum of even numbers.

Input Format
The first line of input contains the integer n.

Output Format
The output should contain the difference of the sum of even numbers to the sum of odd numbers.

Example 1
Input

1
Output:

-1
Example 2
Input

4
Output:

2
Example 3
Input

7
Output:

-4
Constraints:

1 <= n <= 10^9