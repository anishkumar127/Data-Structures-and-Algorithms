import java.util.*;
import static java.lang.Math.ceil;

class Accio {
    public void ValidatePerfectSquare(int num) {
        // Write your code here
                    int s =1;
        int e = num;
        while(s<=e){
            long mid = s+(e-s)/2;
            if(mid*mid == num){
                    System.out.print("YES");
                return ;
            }else if(mid*mid>num){
              e = (int)mid-1;
            }else{
                s =(int) mid+1;
            }
        }
        
        // return false;
            System.out.print("NO");

    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Accio Obj = new Accio();
        Obj.ValidatePerfectSquare(n);

    }
}


You are given a positive integer n, Your task is to print YES if n is a perfect square, else print NO

Note: Do not use any built in library function

Input Format
First and only line contains the integer n

Output Format
Single line output containing string YES or NO

Example 1
Input

16
Output

YES
Explanation

16 is perfect square of 4.

Example 2
Input

14
Output

14
Explanation

14 is square of 3.742, which is a decimal number so 14 is not a perfect square.

Constraints
1 <= n <= 2^31 - 1