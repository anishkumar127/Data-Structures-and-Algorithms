import java.util.*;

/*  array is sorted or not. 
5
1 2 3 4 1

ans = no.
*/
public class Main {
    public static void main(String[] args) {
Scanner s = new Scanner(System.in);
         int n;
        n = s.nextInt();
        int ans = 0;
        int a[] = new int[n];
        for (int i = 0; i < n; i++) 
        {
            a[i] = s.nextInt();
        }
        
        for (int i = 0; i < n - 1; i++) {
        if(a[i] > a[i + 1]){
         
            ans = 1;
    }
        }
        
        if(ans ==1){
          System.out.print("NO");
        }else{
          System.out.print("YES");
        }
  }
}