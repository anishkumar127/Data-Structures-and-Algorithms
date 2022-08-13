import java.util.*;
/*
STDIN
3 2 5

Output:

3 6 12 24 48 
*/
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int r = sc.nextInt();
      int n = sc.nextInt();
			int curr_term;
			
  	 for (int i = 0; i < n; i++) {
  			curr_term = a * (int)Math.pow(r, i);
  			System.out.print(curr_term + " ");
  		}
  }
}
