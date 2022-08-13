import java.util.*;

/*
6
xxhixx
*/
public class Main {
    public static void main(String[] args) {
      // System.out.println("Hello, World!");
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      String s = sc.next();
      int count = 0;
      for(int i =0; i<s.length()-1; i++){
        // if((s.charAt(i)=='h') && (s.charAt(i+1)=='i')){
          if(s.substring(i,i+2).equals("hi")){
          count++;
        }
      }
      System.out.println(count);
      
      // 2nd way.
      int ans = countHi(s);
      System.out.println(ans);
  }
  private static int countHi(String s){
     if (s.length() < 2) return 0;

  if (s.substring(0,2).equals("hi")) return 1 + countHi(s.substring(1));

  else return countHi(s.substring(1));

  }
}

