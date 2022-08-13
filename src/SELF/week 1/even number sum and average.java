import java.util.*;

public class Main {
    public static void main(String[] args) {
    
     int arr[] = {1, 4 ,2 ,5};
     int sum =0;
     int count = 0;
     
for(int i=0; i<arr.length; i++){
  if(arr[i]%2==0){
    sum = sum + arr[i];
    count++;
  }
}
System.out.println(sum); // 6 --> 4 +2 = 6.
System.out.println(count); // 2
int ans = sum/count; // 6 /2  = 6.
System.out.print(ans);
  }
}