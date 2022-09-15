import java.util.*;

public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String s = sc.next();
     
     int count =1;
    // char ch[]  = s.toCharArray();
     
     for(int i=0; i<s.length(); i++){
       char ch = s.charAt(i);
       if(ch >= 'A' && ch <= 'Z'){
         count++;
       }else{
         continue;
       }
     }
     System.out.print(count);
  }
}



There is a sequence of words in camelCase as a string of letters, s , having the following properties:

It is a concatenation of one or more words consisting of English letters.
All letters in the first word are lowercase.
For each of the subsequent words, the first letter is uppercase and rest of the letters are lowercase.
Given s , determine the number of words in s.

Example
s = oneTwoThree There are 3 words in the string: "one", "Two", "Three".

Input Format A single line containing string .

Output Format A single integer which is the total number of words in the string

Constraints

1 <= length of s <= 105
Sample Input

saveChangesInTheEditor
Sample Output

5
Explanation

String contains five words:

save
Changes
In
The
Editor

