import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      
      int rs = 80;
      
      int indian = n*rs;
      System.out.print(indian);
  }
}



import java.util.*;

class Solution{
    static int usdToINR(int n)
    {
                return  n*80;
     
        //Write Code Here
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution Ob = new Solution();
        System.out.println(Ob.usdToINR(n));
    }
}




Alice has recently moved to United States. He faces problem in the currency conversion from United States Dollar (USD) to Indian rupee (INR). Help him out in this conversion by returning the amount in INR.

Assuming the conversion rate to be:

1 USD = 80 INR
Input Format
An integer, representing the money in USD.

Output Format
Return an integer representing converted money in INR.

Constraints
1 < = N < = 100000

Example
Sample Input 1

100
Sample Output 1

8000
Sample Input 2

65
Sample Output 2

5200