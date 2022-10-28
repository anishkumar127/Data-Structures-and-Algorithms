import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) {
		// your code here
Scanner sc = new Scanner(System.in);
                int t = sc.nextInt();
                while(t-->0){
                          String str = sc.next();
                HashSet<String> differentSubStrings = new HashSet<>();

		// Iterate through the string str.
		for (int i = 0; i < str.length() - 1; i++) {

			// Add substring if size 2 into differentSubStrings.
			differentSubStrings.add(str.substring(i, i + 2));
		}
		// Return the size of the differentSubStrings.
		System.out.println( differentSubStrings.size());
                }
              
	}
}


Brute Force
The basic idea is to iterate through the ‘STR’ and store all the substrings of size 2 in a HashSet and finally return the size of this HashSet.

 

The steps are as follows:

 

Declare a HashSet ’DIFFERENT_SUB_STRINGS’ in which we will store all the substrings of size 2.
Run a loop from ‘i’ = 0 to length of ’STR’ - 1:
Add substring of ’STR’ from ’i’ to ’i’ + 1 in ’DIFFERENT_SUB_STRINGS’.
Finally, return the size of ’DIFFERENT_SUB_STRINGS’.
Time Complexity
O(N), where ‘N’ is the length of the ’STR’.

 

Since we are just iterating through the ’STR’ once and so, the overall time complexity is O(N).

Space Complexity
O(N), where ‘N’ is the length of the ’STR’.

 

As we are storing all the substrings in a set ’DIFFERENT_SUB_STRINGS’. In the worst case, we have ‘N’ - 1 different substring. Hence, the overall space complexity is O(N).




Ninja has been given a string 'STR' containing only lowercase alphabetic characters. Ninja has to find the number of all the different possible substrings of size two that appear in 'STR' as contiguous substrings.

For example : If the string is “abcd”, then all possible substrings of size two are { “ab”, “bc”, “cd”}.

Input Format : The first line contains a single integer ‘T’ representing the number of test cases. The next ‘T’ lines contain a string 'STR' which denotes the input string.

Output Format : For each test case, print all different substrings of size two that appear in 'STR' as contiguous substrings.

Output for every test case will be printed in a separate line.

Constraints: 1 <= T <= 5*10^3 2 <= |STR| <= 10^3

Time limit: 1 sec

Example 1: 2 abc dede

Output : 2 2

Explanation : In the first test case, all the different possible substrings of size two are “ab” and “bc”.

In the second test case, all the different possible substrings of size two are “de” and “ed”.

Example 2: 2 coding ninjas

Output : 5 5

Explanation : In the first test case, all possible different substrings of size two are “co”, “od”, “di”, ‘in”, and “ng”. In the second test case, all possible different substrings of size two are “ni”, “in”, “nj”, “ja”, and “as”.