import java.util.*;

public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     switch(n){
       case 12: 
         System.out.print("I am even");
         break;
       case 13: 
         System.out.print("I am prime");
         break;
       case 25:
         System.out.print("I am odd");
         break;
       default:
         System.out.print("I am just a number");
     }
  }
}



Write a java program using switch case such that if user enters 12 then output will be "I am even", if user enters 13 then output will be "I am prime", if user enters 25 then output will be "I am odd". If user does not enter any of these numbers then output will be "I am just a number".

Example

Input 1 12 Output 2 I am even

Input 2 13

Output 2 I am prime



