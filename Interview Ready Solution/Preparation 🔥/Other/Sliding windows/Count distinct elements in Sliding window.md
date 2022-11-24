```java
import java.util.*;

class Solution {
    public int[] countDistinct(int[] arr, int k) {
        //Write code here
		 int s = 0;
        int e = 0;
        int n = arr.length;
        int idx =0;
        int [] bucket=new int[k];
        Map<Integer,Integer> map = new HashMap<>();
        while(e<n){
            map.put(arr[e],map.getOrDefault(arr[e],0)+1);
            if(e-s+1<k){
            e++;
            }
            else if(e-s+1==k){
                bucket[idx++] =map.size();
                map.put(arr[s],map.getOrDefault(arr[s],0)-1);
                if(map.get(arr[s]) <=0) map.remove(arr[s]);
                s++;
                e++;
            }
        }
		map.clear();
        return bucket;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k;
        n = sc.nextInt();
        k = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Solution Obj = new Solution();
        int result[] = Obj.countDistinct(arr, k);
        for (int i = 0; i < result.length; i++)
            System.out.print(result[i] + " ");
        System.out.println();
        sc.close();
    }
}

````

```java
package Try;
import java.util.*;
/*
1 2 1 3 = 3
2 1 3 4 = 4
1 3  4 2 = 4
3 4 2 3 = 3
 */
class CountDistinct {
    public int[] countDistinct(int[] arr, int k) {
        //Write code here
        int s = 0;
        int e = 0;
        int n = arr.length;
        int idx =0;
        int [] bucket=new int[k];
        Map<Integer,Integer> map = new HashMap<>();
        while(e<n){
            map.put(arr[e],map.getOrDefault(arr[e],0)+1);
            if(e-s+1<k){
            e++;
            }
            else if(e-s+1==k){
                System.out.println(map);
                bucket[idx++] =map.size();
                map.put(arr[s],map.getOrDefault(arr[s],0)-1);
                if(map.get(arr[s]) <=0) map.remove(arr[s]);
                s++;
                e++;
            }
        }
        return bucket;
    }
}

 class Something {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k;
        n = sc.nextInt();
        k = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        CountDistinct Obj = new CountDistinct();
        int result[] = Obj.countDistinct(arr, k);
        for (int i = 0; i < result.length; i++)
            System.out.print(result[i] + " ");
        System.out.println();
        sc.close();
    }
}

```