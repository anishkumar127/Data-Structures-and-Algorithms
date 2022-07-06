import java.util.*;
/*  array even or not . 
1
2

ans = GOOD.
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
        for(int i = 0 ; i < n ; i++)
        {
            if(a[i] % 2 != 0)
            {
             
                ans = 1;
            }
        }
        
        if (ans ==1){
          System.out.print("BAD");
        }else{
          System.out.print("GOOD");
        }
  }
}