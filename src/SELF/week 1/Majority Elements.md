<!-- https://onecompiler.com/java/3ycvex6ph -->

 <!-- GFG -->

 ```
import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int [] nums =new int [n];
     int size = nums.length;
     for(int i =0; i<n; i++){
       nums[i] = sc.nextInt();
     }
     
     int count =0;
     int major = 0;
     
     for(int x:nums){
       if(count==0){
         major = x;
       }
       if(count==major){
         count++;
       }else{
         count--;
       }
     }
     System.out.print(count); // -3
     //do again count count the size of major elements.
     count =0;
     for(int x:nums){
       if(x==major){
         count++;
       }
     }
    System.out.print(count);  // 2
     if(count<=size/2){
      System.out.print(-1);
     }
    else System.out.print(major); // 3
  }
}
```

 <!-- moore voting algorithms  -->
```
 import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int [] nums =new int [n];
     for(int i =0; i<n; i++){
       nums[i] = sc.nextInt();
     }
     int count =0;
     int major = nums[0];  // assume major rahega hi array me.
     
     for(int x:nums){
       if(count==0){
         major = x;
         count++;
       }
       else if(x == major){
         count++;
       }
       else {
         count--;
       }
     }
     
     System.out.print(major);
  }
}
```


 <!-- moore voting algorithms  -->


```
 import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int [] nums = new int[n];
     for(int i =0; i<n; i++){
       nums[i] = sc.nextInt();
     }
     int count = 0;
     int ret = 0;
     for(int x: nums){
       if(count==0){
         ret = x;
       }
       if(x!=ret){
         count--;
       }
       else 
       {
         count++;
       }
     }
     System.out.print(ret);
  }
}

```

 <!-- using Sorting O(nlogn)  -->


```
 import java.util.*;

public class Main {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int [] nums = new int [n];
     for(int i =0; i<n; i++){
       nums[i] = sc.nextInt();
     }
     Arrays.sort(nums);
       int ans =  nums[nums.length/2];
       System.out.print(ans);
    }
}
  ```


