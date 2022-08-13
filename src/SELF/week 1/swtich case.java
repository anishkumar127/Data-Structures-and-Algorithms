import java.util.*;
/*
Write a java program using switch case such that if the case is 55 
then "Study is important" will be the output
otherwise "No value" will be the output.
*/
public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = 55;
     
     switch(n){
       case 55 :
         System.out.print("Study is important");
         break;
         default :
         System.out.print("No value");
     }
  }
}
