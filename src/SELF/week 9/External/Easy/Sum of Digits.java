import java.util.*;

class Accio {
    static int sumDigit(int n)
    {
        //Write Code Here
            int sum =0;
            while(n>0){
                    int digit = n%10;
                    sum+=digit;
                    n=n/10;
            }
            return sum;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        Accio Ob = new Accio();
        System.out.println(Ob.sumDigit(n));
    }
}



    Your task is to find the sum of all the digits in the number without using recursion.

Input Format
The only line of input contains a number.

Output Format
Print the sum of digits of the given number.

Example 1
Input

1873
Output

19
Explanation

1+8+7+3 = 19. Hence the output should be 19.

Example 2
Input

80923
Output

22
Explanation

The sum of the digits is 22.

Constraints
1 <= |n| <= 10^9