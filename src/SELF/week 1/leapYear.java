import java.util.*;
/*
Given a year, find if it is a leap year.

A Leap year is the year that is multiple of 4. But, multiples of 100 which 
are not multiples of 400 are not leap years.

User Task:
Input consists of the year value as an int. You need to print 1 in case of
leap year and 0 otherwise.

Sample Input:
2004

Sample Output:
1

Sample Input:
2000

Sample Output:
1

Sample Input:
1900

Sample Output:
0

Explanation:
Since 1900 is divisible by 100 but not divisible by 400, so it is not a leap year.
*/
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      
      if(n%4==0 && n%100!=0 && n%400==0){
        System.out.print(1);
      }else{
        System.out.print(0);
      }
  }
}