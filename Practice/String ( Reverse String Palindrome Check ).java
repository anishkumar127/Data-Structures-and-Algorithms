import java.util.*;

public class Main {
    public static void main(String[] args) {
      
       // reverse string.
      Scanner sc= new Scanner(System.in);
      String word = sc.nextLine();
      char ch = word.charAt(0);
      for(int i=word.length()-1; i>=0; i--){
        System.out.print(word.charAt(i));
      }
      
      // check string palindrome.
      System.out.println();
      isStringPalindrome(word);
      
      
    }
    private static void isStringPalindrome(String word){
     // example.  naman yes but namaz no. not same 
     int i=0; 
     int j = word.length()-1;
     
     while(i<j){
       if(word.charAt(i)!= word.charAt(j)){
         System.out.print("NO");
         return;
       }
      
       i++;
       j--;
     }
   System.out.print("YES");
    }
}