import java.util.*;

class Solution {
    static void printNumbers(int a, int b){
        //Write code here and print output
          for(int i=a; i>=b; i--){
        if(i%2!=0 && i%5!=0){
          System.out.println(i);
        }
      }
     
    }
}
public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Solution.printNumbers(a, b);
    }
}




import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc  = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      
      for(int i=a; i>=b; i--){
        if(i%2!=0 && i%5!=0){
          System.out.println(i);
        }
      }
  }
}




Print all the numbers starting from A to B (both inclusive), that are not divisible by 2 or 5.

Input Format
The first line of input contains two space separated integers 'A' and 'B'.

Output Format
You should output all numbers between A and B (both inclusive) that are not divisible by 2 or 5.

Example 1
Input

12 2
Output

11
9
7
3
Explanation

These are the numbers which are not divisible by 2 or 5 between 12 to 2.

Example 2
Input

20 20
Output

Explanation

No numbers lies between this given range .

Example 3
Input

5 0
Output

3
1
Explanation

Only 3 and 1 is not divisible by 2 or 5 between 5 to 0.

Constraints
0 <= B < A <= 10^5