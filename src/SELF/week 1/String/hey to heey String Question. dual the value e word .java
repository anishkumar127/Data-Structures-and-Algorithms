import java.util.*;
// hey heey heeeey
public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String s = sc.next(); 
    // 1st way 
     int count = 0;
     for(int i =0; i<s.length(); i++){
       if(s.charAt(i)=='e'){
       count = count+1;
       }
     }
     String ans = "h";
     for(int i=0; i<2*count; i++){
       ans= ans+"e";
     }
     ans = ans+"y";
    System.out.print(ans);
    
    // 2nd way 
    // System.out.print(s.replace("e","ee"));
    
  }
}