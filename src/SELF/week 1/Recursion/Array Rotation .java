import java.util.*;
/*
STDIN
5 2
1 2 3 4 5


Output:

3 4 5 1 2 
*/
public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
     int d = sc.nextInt();
    int [] arr= new int [n];
    for(int i=0; i<n;i++){
      arr[i] = sc.nextInt();
    }
     d %= arr.length;
   int size = arr.length;

       reverse(arr,0,d-1);
        reverse(arr,d,size-1);
        reverse(arr,0,size-1);

   
    
    for(int print:arr){
      System.out.print(print+" ");
    }
  }
  
  public static int[] reverse(int arr[], int start,int end){
    while(start<end){
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
    
    return arr;
  }
}