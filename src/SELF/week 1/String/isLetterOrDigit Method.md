


/*
isLetterOrDigit(char ch)

Parameters: The function accepts a single mandatory parameter ch which signifies the character 
to be tested.

Return value: This function returns a boolean value. The boolean value is true if the character is a 
letter or digit else it false
*/



/*

if you import Java.util.* this means that you import all the classes of the utility package in the program. * means all of the classes are import to this program.

if you import Java.io.* this means that you import all the classes of the input output package in the program.
*/




import java.util.*;

public class Main {
    public static void main(String[] args) {
      char c1 = 'a';
      char c2 = '/';
      
      boolean ans = Character.isLetterOrDigit(c2);
      System.out.print(ans);
  }
}