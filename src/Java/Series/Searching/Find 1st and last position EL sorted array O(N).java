package com.company.Practice;
// find first and last position in sorted array.

//O(logn); TC optimization.

//O(N); TC and O(1); no space. 
public class findFirstAndLastPosition {

    public static void find(int [] arr,int target){
        int first = -1;
        int last = -1; // not found.
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target && first ==-1){
                first=i;
            }
            if(arr[i]==target && first !=-1){
                last = i;
            }

        }
        System.out.print("first "+first+" last "+last);
    }

}


public class Main {
    public static void main(String []args){

        findFirstAndLastPosition found = new findFirstAndLastPosition();
        int arr[] = {1,3,4,8,8,11,11,11,11,12,13,14};
        int target = 11;
        found.find(arr,target);
    }
}


// output:- first 5 last 8