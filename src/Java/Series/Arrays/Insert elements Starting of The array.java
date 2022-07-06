import java.util.*;
// insert the elements starting of the array.
public class Main {
  int count=0;
  
    public static void main(String[] args) {
      Main o = new Main();
      
        int arr[] = new int[5];
        
        for(int j=0; j<arr.length; j++){
          o.insert(arr,j+1);
        }
        o.print(arr);
        o.insertAtStart(arr,34);
        System.out.println();
        o.print(arr);
       
    }
    public void insert(int arr[], int val){
      arr[count++] = val;
    }
    
    public void insertAtStart(int arr[], int val){
      // arr.length-1 or count -1
      for(int i = count-1; i>0; i--){
        arr[i]=arr[i-1];
      }
      
      arr[0]=val;
      
    }
    
    public void print(int arr[]){
       for(int i=0; i<arr.length; i++){
          System.out.print(arr[i]+" ");
        }
    }
}