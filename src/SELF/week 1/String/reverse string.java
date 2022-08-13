import java.util.*;

public class Main {
    public static void main(String[] args) {
      // System.out.println("Hello, World!");
      Scanner sc = new Scanner(System.in);
      
      String st = sc.nextLine();
      
      for(int i=st.length()-1; i>=0; i--){
        System.out.print(st.charAt(i));
      }
        
      
      // int i =0; 
      // int end = st.length()-1;
      // while(i>end){
      //   int temp = st.charAt(i);
      //   st.charAt(i) = st.charAt(end);
      //   st.charAt(end) = temp;
      //   i++;
      //   e--;
      // }
      // System.out.print(st);
  }
}