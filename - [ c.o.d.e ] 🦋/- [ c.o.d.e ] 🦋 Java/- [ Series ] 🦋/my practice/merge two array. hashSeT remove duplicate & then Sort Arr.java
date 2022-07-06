import java.util.*;

public class Main {
    public static void main(String[] args) {
       Set<Integer> no_duplicate = new HashSet<>();
        int arr1[] = {2,4,2,4,5};
        int arr2[] = {3,2,9,0,};
        int arr3[] = new int[arr1.length+ arr2.length];
        int len1 = arr1.length;
        int len2 = arr2.length;
        int len3 = len1+len2;

        for (int i = 0;i<arr1.length;i++){
            arr3[i] = arr1[i];
        }
        for (int i = 0;i<arr2.length;i++){
            arr3[len1+i] = arr2[i];
        }
        // Set no_duplicate = new HashSet<>();

        for (int k = 0;k< arr3.length;k++){
            no_duplicate.add(arr3[k]);
        }

        System.out.print(no_duplicate + " ");
        System.out.println();
        Set [] arr = {no_duplicate};

        Arrays.sort(arr);
        
        for (int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}