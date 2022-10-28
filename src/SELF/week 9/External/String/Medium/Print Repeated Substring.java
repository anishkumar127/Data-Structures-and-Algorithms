import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        System.out.println(repeatEnd(s, k));
        sc.close();
    }

    public static String repeatEnd(String s, int k) {
        // your code here
 String ans ="";
      for(int i=0; i<s.length(); i++){
        if(i<s.length()-k){
          continue;
        }
        else ans+=s.charAt(i);
      }
      // System.out.println(ans);
  
    String res = "";
      while(k-->0){
      res+=ans;
      }
      // System.out.print(res);
            return res;
    }

}



Given a string s and an integer n, extract the last n characters of the string, treat them as a string and print a new string which is basically the extracted string placed n times together. For example: s = abc, n = 2 so the resultant will be bcbc.

Input Format:
First line consists of string s.

Next line consists of integer n.

Output Format:
Print the desired string.

EXAMPLE 1:
Input:

Acciojob
3
Output::

jobjobjob
EXPLANATION:

Substring of last 3 characters of the string is job and by appending it 3 times we get jobjobjob.

EXAMPLE 2:
Input:

coding
1
Output::

g
EXPLANATION:

Substring of last 1 character of the string is g and by appending it 1 time we get g.

CONSTRAINTS:
0 < s.length <= 1000

1 <= n <= s.length