import java.util.*;

public class Main {
  // doing sum of number using for loop with function.
  public static int SumOfNumber(int n){
    int sum = 0;
    for(int i=1; i<=n; i++){
      sum +=i;
    }
    return sum;
  }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
        int data =SumOfNumber(n);
      System.out.println(data);
    }
}
