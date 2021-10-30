import java.util.*;
// UpperCase to LowerCase and LowerCase To Uppercase String.
public class Main {
  
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      char a = sc.next().charAt(0);
      
    upperCase(a);
    lowerCase(a);
    }
    
    public static void upperCase(int a){
       int temp = (int)a;
       temp -= 32;
       System.out.println((char)temp);
    }
 public static void lowerCase(int a){
   int temp =(int)a;
   temp +=32;
   System.out.println((char)temp);
 }   
}
