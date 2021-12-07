import java.util.*;
// output getting 
4 8 5 3 6 3 2 -1 
next maximum greater

public class Main {
    public static void main(String[] args) {
         int arr[] = {2,4,8,5,3,6,3,2};
        //  8 8 6 6 6 3 2 -1
        // { 1 , 5, 9, 6, 7 2 1 }
        // 9  9 7  7  2 1 -1
        
        // arr[i] =arr[i+1];
        // arr[i]= Math.max()
         
         int n= arr.length;
         greater(arr,n);
         
    }
    public static void greater(int arr[], int n ){
      
        int  next, i, j;
        int max = Integer.MAX_VALUE;
        // int max = Integer.MIN_VALUE;
        for (i=0; i<n; i++)
        {
            next = -1;
            for (j = i+1; j<n; j++)
            {
                if (max >arr[j])
                {
                    next = arr[j];
                    break;
                }
              
            }
            System.out.print(next+" ");
        }
    }
}