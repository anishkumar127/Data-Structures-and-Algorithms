``Power Of a Number``
Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another. (Do not use Java built-in method)

Input Format : The first line will contain two numbers a and b

Output Format : In the output you need to print an ans denoting a raise to power b

Constraint : 1<=a,b<=15

Sample Input 1 : 5 3

Sample Output 1 : 125

Sample Input 2: 7 2

Sample Output 2: 49


```
package PowerOfNumber;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int ans = 1;
        for(int i =0; i<t; i++){
            ans*=n;
        }
        System.out.println(ans);
    }
}
```