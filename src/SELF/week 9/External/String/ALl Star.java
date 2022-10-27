import java.util.*;

public class Main {
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   String s= sc.next();
   
   StringBuilder sb = new StringBuilder();
   int n = s.length();
   for(int i=0; i<n;i++){
     sb.append(s.charAt(i)).append("*");
   }
  
  System.out.print(sb.substring(0,sb.length()-1).toString());
  }
}

/*
Input

hello
Output

h*e*l*l*o

*/



import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        sc.close();
        Solution ob = new Solution();
        String ans=ob.allStar(str);
        System.out.println(ans);
    }
}
class Solution{
    public String allStar(String s) {
        //Write Code here
             
   StringBuilder sb = new StringBuilder();
   int n = s.length();
   for(int i=0; i<n;i++){
     sb.append(s.charAt(i)).append("*");
   }
  
  return sb.substring(0,sb.length()-1).toString();
    }
}


You are given a string str.

Your task is to compute recursively a new string where all the adjacent chars are now separated by a "*".

Input Format
The first line contains the string.

Output Format
For each test case return a string, where all the adjacent chars are now separated by a "*".

Example 1
Input

hello
Output

h*e*l*l*o
Explanation

Each character in the string is separated by "*" in the output.

Example 2
Input

ab
Output

a*b
Explanation

Each character in the string is separated by "*" in the output.

Constraints
1 <= size of string <= 1000
