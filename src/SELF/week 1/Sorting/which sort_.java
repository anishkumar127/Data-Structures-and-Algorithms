package SelectionSort;

import java.util.Scanner;
import java.util.*;
public class SelectionSortTry
{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr= new int [n];
//        scanner input of array
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<n-1; i++){
            int maxIndex = i;
            for(int j=i+1; j<n; j++){
                if(arr[maxIndex]>arr[j]){
                    // swap
                    int temp = arr[maxIndex];
                    arr[maxIndex] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print(Arrays.toString(arr));
    }
}
