import java.util.*;

public class Main {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String[] arr = n.split("\\s+");
        for(int i=0; i<arr.length; i++){
            System.out.print(" " + Integer.parseInt(arr[i]) );
        }
  }
}