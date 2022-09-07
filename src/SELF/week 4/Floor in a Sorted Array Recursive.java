import java.util.*;

public class Main {
  static int ans;
    public static void main(String[] args) {
      ans =-1;
     Scanner sc= new Scanner(System.in);
     int n = sc.nextInt();
     int[] arr = new int[n];
     int t = sc.nextInt();
     for(int i=0; i<n; i++){
       arr[i]  = sc.nextInt();
     }
     
     floor(arr,0,arr.length-1,t);
     System.out.print(ans);
  }
  
  private static void floor(int arr[], int start, int end, int t){
   // base case :
   if(start>end){
     return ;
   }
     int mid = start+(end-start)/2;
     if(arr[mid]<=t){
       ans = mid;
       floor(arr,mid+1,end,t);
     }else{
       floor(arr,start,mid-1,t);
     }
  }
}