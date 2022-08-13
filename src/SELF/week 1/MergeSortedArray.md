 <!-- two pointer -->

 package Try;
// not working.
import java.util.Scanner;

public class MergeSortedArrayTwoPointer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] nums1= new int[m];
        int[] nums2= new int[n];
        int[] merge = new int[nums1.length+nums2.length];
        for(int i=0; i<m; i++){
            nums1[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            nums2[i] =  sc.nextInt();
        }
        int p1 = m-1;
        int p2 = n-1;
        int i = m+n-1;
        while(p2>=0) {
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[i] = nums1[p1];
                i--;
                p1--;
            } else {
                nums1[i] = nums2[p2];
                i--;
                p2--;
            }
        }
    }
}



<!-- iterative  -->

package Try;
import java.util.*;
/*
 1 2 3
 2 5 6
 m 3 n 3
* */
public class MergeSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] nums1= new int[m];
        int[] nums2= new int[n];
        int[] merge = new int[nums1.length+nums2.length];
        for(int i=0; i<m; i++){
            nums1[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            nums2[i] =  sc.nextInt();
        }

            int first = 0;
            int second = 0;
            int k = 0;
            while(first<m && second<n){
                if(nums1[first]<nums2[second]){
                    merge[k] = nums1[first];
                    k++;
                    first++;
                }else{
                    merge[k] = nums2[second];
                    k++;
                    second++;
                }
        }
            while(first<m){
                merge[k] = nums1[first];
                k++;
                first++;
            }
            while(second<n){
                merge[k]  = nums2[second];
                k++;
                second++;
            }
        for(int x:merge){
            System.out.print(x+" ");
        }

    }
}



