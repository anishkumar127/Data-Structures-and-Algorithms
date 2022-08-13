package BubbleSort;
import java.util.*;
// no extra space.
// no copying the array.
// this is also known as in-place sorting algorithms. no need extra array.
// tc. best case - O(N), worst case : O(N^2),
// it is stable sorting algorithms. order should be same when value is same.
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n; i++){
            arr[i] =sc.nextInt();
        }

        // actual part begin.
        boolean swapped;
        for(int i=0; i<n; i++){ // run the steps n-1; times.
            swapped = false;
            for(int j=1; j<n-i; j++){ // j is internal loop. we can do. j<=n-i-1; or j<n-i; help in rounded tc reduce.
                if(arr[j]<arr[j-1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped=true;
                }
            }
            if(!swapped){ // !false = true;
                break;
            }
        }
        for(int print:arr){
            System.out.print(print+" ");
        }
    }
}

