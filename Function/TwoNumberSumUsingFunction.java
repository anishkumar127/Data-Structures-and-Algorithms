import java.util.*;
// using easy two number sum. with function.
public class Main {
  public static int sum(int one, int two){
    int s = 0;
     s = one + two;
     return s;
  }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int one = sc.nextInt();
        int two = sc.nextInt();
        int data =sum(one,two);
        System.out.println(data);
    }
}
