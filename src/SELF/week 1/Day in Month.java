import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc  = new Scanner(System.in);
      int n = sc.nextInt();
       if(n==2){
        System.out.print("28");
        return;
      }
      if(n==1||  n==3|| n==5|| n==7|| n == 8|| n ==10|| n==12){
        System.out.print("31");
      }else{
        System.out.print("30");
      }
     
  }
}
