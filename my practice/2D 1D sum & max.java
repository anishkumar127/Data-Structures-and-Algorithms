import java.util.*;

public class Main {
    public static void main(String[] args) {
 /*
 Do using Array list we have to do like that.
 
 Arraylist ans = new Arraylist
 
 ans.add(sum);
 ans.add(max);
 */
  //             1 2 3
            //   4 5 6
            //   7 8 9
int arr[][] = {{1,2,3}, {4,5,6}, {7, 8,9}} ;
int brr[] = {3, 6, 9};
int sum = 0;
int max =   Integer.MIN_VALUE;
for(int i =0; i<arr.length; i++){
  for(int j=0; j<arr.length; j++){
    if(i==j){
    sum+=arr[i][j];
    }
  }
}
for(int i=0; i<brr.length; i++){
  if(brr[i]>max){
    max=brr[i];
  }
}
System.out.print(sum+ " "+max);
    }
}