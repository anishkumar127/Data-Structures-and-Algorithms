``extra space O(n)  Tc O(n)``

```
import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     int n= sc.nextInt();
     int [] arr =new int[n];
     for(int i =0; i<n; i++){
       arr[i] = sc.nextInt();
     }
     int max = Integer.MIN_VALUE;
     int ans[] = new int[n];
     for(int i = arr.length-1; i>=0; i--){
       if(arr[i]>=max){
        ans[i] = arr[i];
         max = arr[i];
       }
     }
     
     for(int x:ans){
       if(x!=0)
       System.out.print(x+" ");
     }
  }
}
```


``O(n^2)``

```
import java.util.*;

/*
n = 6
A[] = {16,17,4,3,5,2}
Output: 17 5 2
Explanation: The first leader is 17 
as it is greater than all the elements
to its right.  Similarly, the next 
leader is 5. The right most element 
is always a leader so it is also 
included.
*/
public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n= sc.nextInt();
     int [] arr =new int[n];
     for(int i =0; i<n; i++){
       arr[i] = sc.nextInt();
     }
   
     for(int i=0; i<n; i++){
       boolean flag = false;
       for(int j=i+1; j<n; j++){
         if(arr[i]<=arr[j]){
           flag = true;
           // j 17 5 5 
           // i 16 4 3
           break;
         }
       }
      if(flag==false){
        System.out.print(arr[i]+" ");
      }
     }
  }
}
```

``arrayList ``

```
import java.util.*;

public class Main {
    public static void main(String[] args) {
     
  }
    ArrayList <Integer> ans = new ArrayList<>();
        if(arr.length==0){
            return null;
        }
        if(arr.length==1){
           ans.add(arr[0]);
          return null;
            
        }
        ans.add(arr[arr.length-1]);
        int max = arr [arr.length-1];
        for(int i=arr.length-2; i>=0; i--){
            if(arr[i]>=max){
                max = arr[i];
                ans.add(arr[i]);
            }
          
        }
         Collections.reverse(ans);
        return ans;
    }
}
}
```