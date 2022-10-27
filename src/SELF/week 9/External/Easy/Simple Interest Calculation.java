import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int R = sc.nextInt();
    int P = 100000;
    int T = 5;
    
    double x = (((P*T*R)/100)+P);
    System.out.println(x);
  }
}

/*
Simple Interest = (P x T x R)/100 
 
where, P is the principal amount  
	   T is the time and  
	   R is the rate of interest
	   p 1,00,000 
	  t 5 
	  r 10 
	  
	   
	   10
Sample Output 1

150000.0

*/



import java.util.*;

class Solution{
    static double finalAmount(int R)
    {
        //Write Code Here
              int P = 100000;
    int T = 5;
    
    double x = (((P*T*R)/100)+P);
return x;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution Ob = new Solution();
        System.out.println(Ob.finalAmount(n));
    }
}



Alice is expanding his current business and requires money for that. His friend Bob has agreed to lend him Rs 1,00,000 for a period of 5 years at a simple interest rate r%. How much money (Principal + Interest) should Alice return to Bob at the end of 5 years?

Simple interest formula is given by:

Simple Interest = (P x T x R)/100 
 
where, P is the principal amount  
	   T is the time and  
	   R is the rate of interest
Input Format
An integer representing simple interest rate.

Output Format
Return the final amount to be returned to Bob.

Constraints
1 < = r < = 100

Example
Sample Input 1

10
Sample Output 1

150000.0
Sample Input 2

6
Sample Output 2

130000.0