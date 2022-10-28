import java.util.*;

public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     String s = sc.next();
     String k = sc.next();
     
     int ans =-1;
     for(int i=0; i<n; i++){
       if(s.charAt(i)==k.charAt(0)){
        // System.out.print(s.charAt(i));
         ans = i+1;
         break;
       }
     }
     System.out.print(ans);
  }
}
/*
Sample Input 4 dhwe w Sample Output 3 Explanation In string 'dhwe', 
the position of
the characters is d=1, h=2, w=3 and e=4. So the position of w will be 3.
*/






Problem Statement

Given a string of N characters and a character C, find the position of that character in that string. If there are multiple occurrences, return the first occurrence from the left.

The string is 1-index based and you need to return the index of the position of the matching character.

If the character is not present, return -1.

Input Format

First-line contains the integer N. Second-line contains the string stn. Third-line contains the character C. Constraints

1<=N<=10^5 The string contains only lowercase characters. Output Format

Return the index of the matching character. Evaluation Parameters

Sample Input 4 dhwe w Sample Output 3 Explanation In string 'dhwe', the position of the characters is d=1, h=2, w=3 and e=4. So the position of w will be 3.