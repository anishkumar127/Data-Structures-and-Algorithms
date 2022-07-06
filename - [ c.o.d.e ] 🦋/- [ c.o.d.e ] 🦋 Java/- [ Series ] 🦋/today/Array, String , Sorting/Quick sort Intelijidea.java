package com.company.Test;
// nlogn best and average
// n2 worst case. when array is sorted.
public class quuuick {

    public int parition(int[] arr,int low, int high){
        int pivot = arr[(low+high)/2];
        while(low<=high){
            while(arr[low]<pivot){
                low++;
            }
            while(arr[high]>pivot){
                high--;
            }
            if(low<=high){
                int temp = arr[low];
                arr[low]=arr[high];
                arr[high]=temp;
                low++;
                high--;
            }
        }
        return low;
    }
    void Recursion(int [] arr, int low, int high){
       int help =  parition(arr,low,high);
        if(low<help-1){
            Recursion(arr,low,help-1);
        }
        if(help<high){
            Recursion(arr,help,high);
        }
    }
    public void display(int[] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}


// main

public class Main {
    public static void main(String[] args) {
   quuuick quick = new quuuick();
        int [] arr={5,6,3,2,4,16,1,11,18};
        int length= arr.length;
        quick.Recursion(arr,0,length-1);
        quick.display(arr);

    }
}


