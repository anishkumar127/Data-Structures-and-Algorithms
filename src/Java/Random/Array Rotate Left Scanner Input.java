import java.util.*;
public class Main
{
    public static void main(String[] args) {
//        5 4
//        1 2 3 4 5
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int [] arr = new int [n];
    int size = arr.length;
        int k= sc.nextInt();
    for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
    }

        k = k%n;
        reverse(arr, 0, k - 1); // 2 1 3 4 5
        reverse(arr, k, size-1); // 2 1 5 4 3
        reverse(arr, 0, size - 1); // 3 4 5 1 2
    for(int ans : arr){
    System.out.print(ans+" ");
    }
    }
    static void reverse(int[] arr, int s, int e){
        while (s<e){
            arr[s] ^=arr[e];
            arr[e]^=arr[s];
            arr[s]^=arr[e];
            s++;
            e--;
        }
    }
}
