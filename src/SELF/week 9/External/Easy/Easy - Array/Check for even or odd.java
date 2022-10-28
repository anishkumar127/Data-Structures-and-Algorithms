import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
    
        int n=sc.nextInt();
        
        Accio A= new Accio();
        
        String ans=A.evenOrOdd(n);

        System.out.println(ans);
    }
}


class Accio {
    String evenOrOdd(int n)
    {
        // Your code 
            if(n%2==0){
                    // System.out.print("Even");
                    return "Even";
            }else{
                    return "Odd";
            }
        
    }
}



You are given a number n. Using bit manipulation you need to determine whether the number is Even or Odd.

Input Format
First line of input contains a single number n.

Output Format
Determine whether the given number is even or odd.

Example 1
Input

20
Output:

Even
Explanation:

20 is divisible by 2.

Example 2
Input

13
Output:

Odd
Explanation:

13 is not divisible by 2.

Constraints
1 <= n <= 10^7