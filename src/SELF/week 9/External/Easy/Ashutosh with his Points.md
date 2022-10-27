import java.util.*;

public class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
      }
      int ans =-1;
    for(int i=0; i<n; i++){
      if(arr[i]==i)
      {
       ans=i;
       break;
    }
    }
    
    System.out.println(ans);
  }
}

/*
4
-1 1 3 5
Output:
1
*/



import java.util.*;

public class Main {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
                int n = input.nextInt();
                int []arr = new int[n];
              
                for(int i=0; i<n; i++){
                        arr[i] = input.nextInt();
                }
                int ans = -1;
                int i=0;
           while(i<n){
                if(arr[i]==i){
                        ans = i;
                        break;
                }
                i++;
        }        
                System.out.println(ans);
  }
}

/*
4
-1 1 3 5
Output:
1
*/


// what i did wrong
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
      }
      
      if(arr[1]==1)System.out.print("1");
      else System.out.print("-1");
  }
}

/*




4
-1 1 3 5
Output:
1
*/



import java.util.*;

public class Main {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
                int n = input.nextInt();
                int []arr = new int[n];
              
                for(int i=0; i<n; i++){
                        arr[i] = input.nextInt();
                }
                int ans = -1;
                int i=0;
           while(i<n){
                if(arr[i]==i){
                        ans = i;
                        break;
                }
                i++;
        }        
                System.out.println(ans);
  }
}

/*
4
-1 1 3 5
Output:
1
*/