import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
       String s = sc.next();

      char ch[] = s.toCharArray();
      int count=0;
      for(int i=0; i<ch.length; i++){
        if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u'){
          count++;
        }
      }
      System.out.print(count);
	}
}

Write a program to find out how many vowels (a, e, i, o, u) are present in a string 'str'. Take input of a string from the user and traverse that string using a loop to find out the count of all the vowels present in it. The input string should only consist of lower case alphabets {Vowels are the letters ‘a’, ‘e’, ‘i’, ‘o’, ‘u’}

Time complexity: O(N) will be the time complexity because we will have to make N iterations to execute the code starting from the 1st element of the array till the Nth element.

Space Complexity: Since we take the same amount of input/space to implement without using any additional space to store, we can say that the Space complexity will be O(1)

Input Format

First line contains a string str.
You don't need to enter double quotes("") while entering the string
Output Format

Print the count of vowels present 
Example

Input

"accioschool"
Output

5 (One ‘a’ + One ‘i’ + three ‘o’ )

