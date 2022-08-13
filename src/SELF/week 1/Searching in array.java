import java.util.*;

public class Main {
  
  /*
  5 3
1 2 5 2 3
output after sorting 1 2 2 3 5 -- index 3

search 2
after soritng 1 2 2 3  --> index 1 2.
  
  */
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
       int s = sc.nextInt();
      int arr[] = new int [n]; 
     
      int index = -1;
      for(int i =0; i<n; i++){
        arr[i] = sc.nextInt();
      }
      boolean flag = false;
      Arrays.sort(arr);
      for(int i =0; i<n; i++){
        if(arr[i]==s){
          index = i;
          System.out.print(index+" ");
          flag=true;
          // break;
        }
      }
      if(flag==false){
        System.out.print(index);
      }
      
  }
  
}

