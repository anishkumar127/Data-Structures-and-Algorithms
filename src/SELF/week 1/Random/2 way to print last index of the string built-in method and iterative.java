import java.util.*;
// 00001 output:- 4
public class Main {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      String s = sc.next();
      
    //   1st way 

      // int ans = s.lastIndexOf('1');
      
      // System.out.println(ans);

      // 2nd way. 
      
      int index = -1;
      for(int i=0; i<s.length(); i++){
        if(s.charAt(i)=='1'){
          index = i;
        }
      }
      System.out.println(index);
      
  }
}