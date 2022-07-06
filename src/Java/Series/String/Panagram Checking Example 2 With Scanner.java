import java.util.*;
// multi input Scanner 
//  checking Panagram or not 
/*
input :
2
Abcdefghijklmnopqrstuvwxyz
Bawdsjogflickquartzvenymph

output: 
1
0
*/
public class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
  int t = sc.nextInt();
  
  while(t-->0){
    
String x = sc.next();
  
   System.out.print(   isPanagram(x.toLowerCase()));
   System.out.println();
  }
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