import java.util.Scanner;

class Accio {
    public static void countCharacter(String s)
    {
       
  int upper =0;
  int lower =0;
  int digit = 0;

for(int i=0; i<s.length(); i++){
  char ch = s.charAt(i);
  if(ch>='A' && ch<='Z'){
    upper++;
  }
  if(ch>='a' && ch<='z'){
    lower++;
  }
  if(ch>='0' && ch<='9'){
    digit++;
  }
}
  System.out.print(upper+" "+lower+" "+digit);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Accio Obj = new Accio();
        Obj.countCharacter(str);
    }
}



import java.util.*;

public class Main {
    public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  String s = sc.next();
  
  int upper =0;
  int lower =0;
  int digit = 0;

for(int i=0; i<s.length(); i++){
  char ch = s.charAt(i);
  if(ch>='A' && ch<='Z'){
    upper++;
  }
  if(ch>='a' && ch<='z'){
    lower++;
  }
  if(ch>='0' && ch<='9'){
    digit++;
  }
}
  System.out.print(upper+" "+lower+" "+digit);
  }
}
/*
AccioJob@1
Output

2 6 1
Explanation

It has two uppercase characters (A,J)
and six lowercase characters (c,c,i,o,o,b) and one numeric character (1).

*/



You are given a string. Your task is to count number of uppercase characters, lowercase characters and digits. Ignore every other characters involved.

Input Format
The only line of input contains a string.

Output Format
Print space separated count of uppercase, lowercase and digits in a single line.

Example 1
Input

AccioJob@1
Output

2 6 1
Explanation

It has two uppercase characters (A,J) and six lowercase characters (c,c,i,o,o,b) and one numeric character (1).

Example 2
Input

Coding is my #1 way of FUN
Output

4 14 1
Explanation

It has 4 uppercase, 14 lowercase and 1 numeric character.

Constraints
1 <= |str| <= 10^5