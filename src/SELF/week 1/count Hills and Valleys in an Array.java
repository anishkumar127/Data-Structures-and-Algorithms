import java.util.*;
// Input: nums = [2,4,1,1,6,5]
// Output: 3
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     int n= sc.nextInt();
     int [] arr =new int[n];
     for(int i =0; i<n; i++){
       arr[i] = sc.nextInt();
     }
     
     int ans = 0;
     int prev = arr[0];
     for(int i=1; i<n-1; i++){
       if(arr[i]>arr[i+1] && arr[i]> prev || arr[i]<arr[i+1] && arr[i]<prev ){
         ans++;
       }
       if(arr[i] != arr[i+1]){
         prev = arr[i];
       }
     }
     System.out.print(ans);
     
  }
}