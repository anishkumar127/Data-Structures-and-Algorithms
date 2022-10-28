import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] inputLine;
        int n = Integer.parseInt(br.readLine().trim());
        int[] arr = new int[n];
        inputLine = br.readLine().trim().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(inputLine[i]);
        }

        int ans = new Solution().print2largest(arr, n);
        System.out.println(ans);
    
    }
}

class Solution {
    int print2largest(int arr[], int n) {
        // code here
        if(n<2){
            return -1 ;
        }
        int max = 0;
        int sm = 0;
        for(int i=0; i<n; i++){
            if(arr[i]>max){
                sm = max;
                max = arr[i];
            }else if(arr[i] >sm  && arr[i] != max){
                sm = arr[i];
            }
        }
        if(sm == 0){
            return -1;
        }
        return sm;
    }
}