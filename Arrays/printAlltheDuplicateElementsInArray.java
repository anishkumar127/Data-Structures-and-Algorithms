import java.util.*;
// print all the duplicate elements in array. who are in the array more than once time.
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr= new int[n];
        for(int i=0; i<n; i++){
          arr[i] = sc.nextInt();
        }
        // skip 1st elements then check second duplicate elements
        
        for(int i=0; i<n; i++){
          for(int j=i+1; j<n; j++){
            // if(i==j){
            //   continue;
            // }
            if(arr[i]==arr[j]){
          System.out.print(arr[i]+" ");
            }
            
          }
        }

    }
}
