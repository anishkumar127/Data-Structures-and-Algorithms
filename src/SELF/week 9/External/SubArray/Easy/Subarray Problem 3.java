import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
      int n= sc.nextInt();
      int arr[] = new int[n];
      for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
      }

    int max = 0;
int sum=0;
for(int val:arr){
  sum+=val;
  max=Math.max(sum,max);
}
System.out.print(max);
    }
}




There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes. The biker starts his trip on point 0 with altitude equal 0. You are given an integer array gain[] of length n where gain[i] is the net gain in altitude between points i​​​​​​ and i + 1 for all (0 <= i < n).

Print the highest altitude of a point that the biker reaches in his entire journey.

Input Format

n => size of the array
gain[0] , gain[1], gain[2], ….. Upto n elements => Elements of the array
Output Format

An integer that represents the highest altitude the biker reaches.
Sample Testcase

Input

5
-5 1 5 0 -7
Output

1
Explanation The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.