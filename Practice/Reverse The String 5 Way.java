// 5 way to reverse the string.
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      String name = "Hello";
      
      // approach 1  toCharArray();
      
      char []  chArr = name.toCharArray();
      
      for(int i =chArr.length-1; i>=0; i--){
        System.out.print(chArr[i]);
      }
      
      System.out.println();  // for space 
      
      // approach 2  charAt();
      
      for( int i =name.length()-1; i>=0; i--){
        System.out.print(name.charAt(i));
      }
      
      
      System.out.println(); // for the space.
        
        // Approach 3 . using extra space rev="";
        String name1 = "anish";
        String rev="";
        for(int i=name1.length()-1; i>=0; i--){
          rev = rev+name1.charAt(i);
        }
        System.out.print(rev);
        
        
        System.out.println(); // for space. 
        
        
        
        // Approach 4 using extra space in toCharArray(); 
        
        
        String name2="hello";
        String rev2="";
        
        char arr[] =name2.toCharArray();
        
        for(int i=name2.length()-1; i>=0; i--){
          
          rev2=rev2+arr[i];
        }
        System.out.print(rev2);
        
        
        System.out.println(); // for the space. 
        
        
        // Appraoch 5 . using XOR; 
        
        String name3 ="anish";
        char arr1[]=name3.toCharArray();
        int n = name2.length();
        int start =0;
        int end =n-1;
        
        while(start<end){
          
          arr1[start] ^=arr1[end];
          arr1[end]^=arr1[start];
          arr1[start]^=arr1[end];
          end--;
          start++;
        }
        for(int i=0; i<n; i++){
          System.out.print(arr1[i]);
        }
        
        System.out.println();
        
        // Approach 5 using Recursion. 
        
        String name4="hello";
        // calling the function.
     System.out.print(   ReverseString(name4));
      // substring ello and charat(0) is  h;   
    }
  private static String ReverseString(String name4){
    if(name4==null || name4.length()<=1){
          return name4;
        }
        return ReverseString(name4.substring(1))+name4.charAt(0);
  }
}