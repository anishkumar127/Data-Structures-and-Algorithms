import java.util.*;

public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String s = sc.next();
     
     char ch = 'x';
     int count =0;
     for(int i=0; i<s.length(); i++){
       if(s.charAt(i)==ch){
         count++;
       }
     }
     
     System.out.print(count);
  }
}



import java.util.Scanner;

class Solution {
    public static int countX(String str, int i, int n)
    {
        //Write your code here
       
          char ch = 'x';
     int count =0;
     for(int z=0; z<str.length(); z++){
       if(str.charAt(z)==ch){
         count++;
       }
     }
     
 return count;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Solution Obj = new Solution();
        int n=str.length();
        System.out.println(Obj.countX(str,0,n));
    }
}


Count recursively the total number of 'x' that appear in the given string.

Input Format
Only line contains the string in which we have to count x.

Output Format
Print the number of x in string in a single line.

EXAMPLE 1
Input:

abcxxabc
Output:

2 
EXPLANATION:

2 'x' are there in the given string.

EXAMPLE 2
Input:

addthe
Output:

0
EXPLANATION:

No x is there in the given string.

CONSTRAINTS
1 <= Len(str) <= 1000

string contains lowercase letter.