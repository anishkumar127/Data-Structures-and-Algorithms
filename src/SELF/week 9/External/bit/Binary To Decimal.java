import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
    
        int t = sc.nextInt();
        while(t > 0){
            String s = sc.next();
            Accio ob = new Accio();
            int ans = ob.binToDec(s);
            System.out.println(ans);
            t -= 1;
        }
    
    }
}


class Accio {
    public int binToDec(String s)
    {
        // Your Code Here
            String num = s;
        int dec_value = 0;
 
        // Initializing base value to 1,
        // i.e 2^0
        int base = 1;
 
        int len = num.length();
        for (int i = len - 1; i >= 0; i--) {
            if (num.charAt(i) == '1')
                dec_value += base;
            base = base * 2;
        }
 
        return dec_value;
    }
}


Given binary representation of number in the form of string, convert it to decimal representation.

Note

String will be given such that output will fit in int

Input Format
First line contains t number of test cases

Next t lines contain string s denoting binary representation

Output Format
Print decimal representation of each string in different line

EXAMPLE 1
Input:

2
10
111
Output::

2
7
EXPLANATION:

10 is the binary representation of 2

111 is the binary representation of 7

EXAMPLE 2
Input:

1
11011
Output::

27
EXPLANATION:

11011 is the binary representation of 27

CONSTRAINTS
1 <= t <= 10^3

