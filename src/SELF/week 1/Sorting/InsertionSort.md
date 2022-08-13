package InsertionSort;
/*
* assume left side always sorted.
* adaptive : steps get reduced if array is stored.
* number of swaps reduced as compare to bubble sort.
* its stable.
* its used for smaller value of N;
* works good when array is partially sorted. (part sorted);
* it takes part in hybrid sorting algorithms.
* high possibility to use this in in-built sorting algorithms of language
* */
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr= new int [n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
InsertionSort(arr);
        System.out.print(Arrays.toString(arr));
    }
    private static void InsertionSort(int []arr){

        for(int i=0; i<arr.length-1; i++){ // OR i<=arr.length-2;
            for(int j=i+1; j>0; j--){
                if(arr[j]<arr[j-1]){ //if current j is smaller then previous one. do swap.
                    swap(arr,j,j-1);
                }else {
                    break;
                }
            }
        }
    }
    private static void swap(int []arr, int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
