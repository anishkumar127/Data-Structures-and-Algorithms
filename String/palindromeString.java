import java.util.*;
// check string is palindrome or not.
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String name = sc.nextLine();
        int i=0;
        int j = name.length()-1;
        
        while(i<j){
          if(name.charAt(i)!=name.charAt(j)){
          System.out.println("Not a palindrome");
          return;
          }
          i++;
          j--;
        }
        System.out.println("its a palindrome");
    }
}
