import java.util.*;
/*

checking panagram.
input: Abcdefghijklmnopqrstuvwxyz
output : 1

convert lowercase then check.
*/

public class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
  
String x = sc.nextLine();
  
   System.out.print(   isPanagram(x.toLowerCase()));
    }
    private static int isPanagram(String x){
      if(x.length()<26){
        return 0;
      }else{
        for(char ch = 'a'; ch<='z'; ch++){
          if(x.indexOf(ch)<0){
            return 0;
          }
        }
      }
      return 1;
    }
}