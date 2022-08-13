import java.util.*;
/*
Write a java program using switch cases in which two positive integers a and b
will be taken as inputs. If (a%b) is 0 then output will be "Remainder is too small", 
if (a%b) is 1 then output will be "Remainder is small", if (a%b) is 2 then output will
be "Remainder is large". In any other cases output will be "Remainder is too large".

Input Format First line contains two integers a and b

output Format Any one of the mentioned lines will be printed as per the value of (a%b)

Example

Input 1 19 6

Output 1 Remainder is small

Input 2 19 5

Output 2 Remainder is too large
*/
public class Main {
    public static void main(String[] args) {
    
  Scanner sc = new Scanner(System.in);
  int a = sc.nextInt();
  int b = sc.nextInt();
  
  switch(a%b){
    case 0:
      System.out.print("Remainder is too small");
      break;
    
    case 1:
      System.out.print("Remainder is small");
      break;
    
      case 2:
      System.out.print("Remainder is large");
      break;
    
    default:
    System.out.print("Remainder is too large");
   
  }
  
  
  
  }
}