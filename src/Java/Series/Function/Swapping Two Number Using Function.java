import java.util.*;

// swap two number using help of function.

public class Main {
  public static void SwappingNumbers(int firstNumber, int secondNumber){
    int temp = 0;
     temp = secondNumber;
     secondNumber= firstNumber;
     firstNumber=temp;
     System.out.println("After Swapping "+firstNumber+" "+secondNumber);
     
  }
    public static void main(String[] args) {
       Scanner sc  =new Scanner(System.in);
       int firstNumber = sc.nextInt();
       int secondNumber = sc.nextInt();
       System.out.println("Before Swapping "+firstNumber+" "+secondNumber);
       SwappingNumbers(firstNumber,secondNumber);
    }
}
