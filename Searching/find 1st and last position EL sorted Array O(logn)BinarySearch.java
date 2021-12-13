// tc - O(logn) binary search, no space O(1);
public class findFirstAndLastPosition {

    public int[] findBinarySearch(int [] arr, int target){
        int [] result ={-1,-1};
        result[0]=findFirst(arr,target);
        result[1]=findLast(arr,target);
        return result;
    }
    public static int findFirst(int [] arr,int target){
      int low = 0;
      int end = arr.length-1;
      int index = -1;
      while(low<=end){
          int mid = (low+end)/2;
          if(arr[mid]==target){
              index = mid;
              end = mid-1;
          }else if(arr[mid]>target){
              end = mid-1;
          }else {
              low = mid+1;
          }
      }
      return index;
    }
    public static int findLast(int [] arr,int target){
        int low = 0;
        int end = arr.length-1;
        int index = -1;
        while(low<=end){
            int mid = (low+end)/2;
            if(arr[mid]==target){
                index = mid;
                low = mid+1;
            }else if(arr[mid]>target){
                end = mid-1;
            }else {
                low = mid+1;
            }
        }
        return index;
    }

}


public class Main {
    public static void main(String []args){

 findFirstAndLastPosition found = new findFirstAndLastPosition();
        int arr[] = {1,3,4,8,8,11,11,11,11,12,13,14};
        int target = 11;
        int[] result = found.findBinarySearch(arr,target);
        System.out.print("first "+result[0]+" ");
        System.out.println("last "+result[1]);

    }
}


// output:- first 5 last 8