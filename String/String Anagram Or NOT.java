import java.util.*;
// check is string Anagram or not.
public class Main {
    public static void main(String[] args) {
        String a="anish";
        String b="kumar";
        char [] a1= a.toCharArray();
        char [] b1= b.toCharArray();
        
        Arrays.sort(a1);
        Arrays.sort(b1);
        if(a.length()!=a.length()){
          System.out.print("Not a anagram");
          return;
        }
        
        for(int i=0; i<a1.length;i++){
          if(a1[i]!=b1[i]){
            System.out.print("Not a anagram");
            return;
          }
        }
        System.out.print("it's a anamgram");
    }
}
