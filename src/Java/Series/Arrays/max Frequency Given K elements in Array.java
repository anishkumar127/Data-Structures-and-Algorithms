import java.util.*;
// find frequency of character k in the array.
// input:-
// 5
// 5 3 2 4 5
// 5

// output: -  2

public class Main {
    public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);

int n = sc.nextInt();
int arr[] = new int[n];

for(int i =0; i<n; i++){
  arr[i]= sc.nextInt();
}
int k = sc.nextInt();

int count =0;
for(int i=0; i<n; i++){
  if(arr[i]==k){
    count++;
  }
}
System.out.print("max frequency is:"+" "+count);

}
}