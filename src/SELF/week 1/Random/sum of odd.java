import java.util.*;

// 4
// 1 2 3 4 
// output 4
public class Main {
    public static void main(String[] args) {
      
      // 4
// 1 2 3 4 

Scanner sc = new Scanner(System.in);
int n =sc.nextInt();
int arr[] = new int[n];
int sum =0;
for(int i =0; i<n; i++){
  arr[i]= sc.nextInt();
  if(arr[i]%2==1){
    System.out.print(arr[i]+" "); // 1 3; 
    sum+=arr[i]; // 1 3 sum is 4;
  }
}
System.out.print(sum);
  }
}
