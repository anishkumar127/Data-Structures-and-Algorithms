import java.util.*;
import java.lang.*;
import java.io.*;
class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String p = sc.nextLine();
        while (t > 0) {
            String s = sc.nextLine();
            Solution obj = new Solution();
            System.out.println(obj.countWords(s));
            t--;
        }
    }
}

class Solution 
{
    public static int countWords(String s)
    {
            String[] arr = s.split(" ");
            return arr.length;
        
    }
}



You are given a string containing some space-separated words. You need to count the number of words in the string.

NOTE You need to complete the given function. The input and printing of output will be handled by the driver code.

Input Format:
The first line contains the number of test cases.

For each test case: The first line has the string S.

Output Format:
For each test case return the number of words.

Example 1:
Input:

1
how  are you
Output:

3
Explanation:

There are three words which are 'how', 'are', and 'you'.

Example 2:
Input:

1
gear five
Output:

2
Explanation:

The two words that are present here are 'gear', and 'five'.

Constraints:
1 <= T <= 10

1 <= |S| <= 10000

