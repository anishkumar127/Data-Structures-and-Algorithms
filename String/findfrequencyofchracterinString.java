import java.util.*;
// find frequency of character x in the String.
public class Main {
    public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 String name = sc.nextLine();
 char c = sc.next().charAt(0);
 int count =0;
 for(int i=0; i<name.length(); i++){
   if(name.charAt(i)==c){
     count++;
   }
 }
 System.out.print("frequency of character c is:"+" "+count);
    }
}
