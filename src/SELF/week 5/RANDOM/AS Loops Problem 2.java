import java.util.*;

public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int count =0;
     while(n>=1){
        count++;
        n=n/10; 
     }
     System.out.print(count);
  }
}





Write a program to find the total number of digits in a single input number (num). Take input of an integer from the user and use a loop(for/while) to execute your approach and finally print the total count of digits present in num.

Approach: First find out the space and time complexity to get the approach for this question

Input Format

First line contains an integer number num
Output Format

Print the count in first line
Example

Input

13472
Output

5