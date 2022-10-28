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
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}

class Solution 
{
    public static String reverseWords(String s)
    {
                Stack<String> st = new Stack<>();
        String temp ="";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==' '){
                if(temp.length()>0){
                    st.push(temp);
                }
                temp ="";
            }else{
               temp = temp+s.charAt(i); 
            }
        }
        String ans ="";
            ans = ans+temp; // whatever left into temp push into ans;
            
            while(!st.isEmpty()){
                ans+=" "+st.pop();  // 
            }
            
            //  " " + blue
            if(ans.length()!=0 && ans.charAt(0)==' '){
                ans = ans.substring(1);
            }
        return ans;
    }
}





You are given a string S containing several space-separated words. You need to reverse the order of appearence of the words.

**NOTE: ** You need to complete the given function. The input and printing of output will be handled by the driver code.

Input Format:
The first line contains the number of test cases.

For each test case: The first line has the string S.

Output Format:
For each test case return the new reversed string.

Example 1:
Input:

1
how are you
Output:

you are how
Explanation:

We reverse the order of appearence.

Example 2:
Input:

1
gear fifth
Output:

fifth gear
Explanation:

We reverse the order of appearence.

Constraints:
1 <= T <= 10

1 <= |S| <= 10000