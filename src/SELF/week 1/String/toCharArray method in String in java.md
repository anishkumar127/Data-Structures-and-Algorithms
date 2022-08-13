import java.util.*;

public class Main {
    public static void main(String[] args) {
   
   
   
   // toCharArray().
   
   // String is collection of different Character.
   
   String s1 = "Anish Kumar";
   
   // convert string to Character array.
   
   // toCharArray method return Character array.  so we have to store.
   
   char[] chr = s1.toCharArray();
   
   // iterative over Character array.
   // using for loop or forEach loop.
   
   
   for(char ch: chr){
     System.out.print(ch+" "); // A n i s h   K u m a r
   }
   
   System.out.println(); 
   
   
   for(int i=0; i<chr.length; i++){
     System.out.print(chr[i]+" ");  // A n i s h   K u m a r 
   }
   
   
   // if string is null it will throw  NullPointerException. 
 
 
  }
}

Output:

A n i s h   K u m a r 
A n i s h   K u m a r 

