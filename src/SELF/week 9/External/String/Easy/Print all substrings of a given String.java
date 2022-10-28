import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String s = sc.next();
      
      int n = s.length();
      
      for(int i=0; i<n; i++){
        for(int j=i; j<n; j++){
          for(int k=i; k<=j; k++){
            System.out.print(s.charAt(k));
          }
          System.out.println();
        }
      }
     
  }
}
/*
Input : abcd Output :
a b c d ab bc cd abc bcd abcd

*/


Time complexity: O(N3), where N is the length of the input string
Auxiliary Space: O(1)



little bit optimization O(N^2);
below code. 

import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String s = sc.next();
      
      int n = s.length();
      
      for(int i=0; i<n; i++){
        String ans="";
        for(int j=i; j<n; j++){
          // System.out.print(s.charAt(j));
         ans+=s.charAt(j);
         System.out.print(ans+"\n");
        }
      }
     
  }
}
/*
Input : abcd Output :
a b c d ab bc cd abc bcd abcd

*/
Time complexity: O(N2), where N is the length of the input string.
Auxiliary Space: O(N), where N is the length of the input string.



inbuilt method but TC O(n^3);

 for (int i = 0; i < n; i++)
           for (int j = i+1; j <= n; j++)
                System.out.println(str.substring(i, j));
    }


















Print all substrings of a given String
Given a string as an input. We need to write a program that will print all non-empty substrings of that given string.

Example :

Input : abcd Output :
a b c d ab bc cd abc bcd abcd