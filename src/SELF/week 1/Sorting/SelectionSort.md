package SelectionSort;
/*
* it perform well not small data.
*
*/
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr= new int [n];
//        scanner input of array
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        // code start from here.
        for(int i=0; i<n; i++){
            // find the max item in the reamining array  & swap with correct index.
            int last = arr.length -i -1;

            int maxIndex = getMaxIndex(arr,0,last); // start is 0, and end is 5-0-1 = 4; 0 to 4 ,
            swap(arr,maxIndex,last); // max index is anyting. which got from maxIndex function. last is 4.

        }

        // printing the array.
        System.out.print(Arrays.toString(arr));


    }
    private static int getMaxIndex (int[] arr,int start, int end){
        int max = start;
        for(int i=start; i<=end; i++){
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max; // it will tell which index have max element.
    }
    private static void swap(int[] arr, int first, int second){
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;  // swap the max elements with last elements.
    }
}
