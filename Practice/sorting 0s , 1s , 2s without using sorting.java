import java.util.*;
// 0 1 0 1  sort without sorting. 
public class Main {
    public static void main(String[] args) {
       int arr[] ={0,0,1,1,0};
       int low = 0;
       int high = arr.length-1;
       int mid= 0;
       
       while(mid<=high){
         switch(arr[mid]){
           case 0: // arry 0 ho to. 
             int temp = arr[low];
             arr[low]=arr[mid];
             arr[mid] = temp;
             low++;
             mid++;
             break;  // now 0 reached right positing. 
             case 1:  // this for 1 counter. // 1 right we have to adjects only 0 and 2;
               mid++;
               break;
               case 2: // when incounter 2. 
                 int temp1 = arr[mid];
                 arr[mid]= arr[high];
                 arr[high] = temp1;
                 high --;
                 break;
                 
         }
       }
       for(int i=0; i<arr.length-1; i++){
         System.out.print(arr[i]+" ");
       }
    }
}