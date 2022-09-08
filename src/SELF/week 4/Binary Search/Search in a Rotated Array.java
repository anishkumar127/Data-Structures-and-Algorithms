import java.util.*;

public class Main {
  private static int search(int [] arr, int start, int end,int x){
    
    // base case. 
    if(start>end) return -1;
    
    int mid = (start+end)/2;
    if(arr[mid]==x) return mid;
    
    if(arr[mid]<arr[start]){
      // right is sorted 
      
      if(x>=arr[mid+1] && x<=arr[end]){
        // go right 
        return search(arr,mid+1,end,x);
      }else{
        // go left 
        return search(arr,start,mid-1,x);
      }
    }else{
      // left is sorted.
      if(x>=arr[start] && x<=arr[mid]){
        // go left 
        return search(arr,start,mid-1,x);
      }else{
        // go right 
        return search(arr,mid+1,end,x);
      }
    }
    
  }
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int x = sc.nextInt();
     int [] arr= new int[n];
     
     for(int i=0; i<n; i++){
       arr[i] = sc.nextInt();
     }
     
     System.out.println(search(arr,0,n-1,x));
     
  }
}