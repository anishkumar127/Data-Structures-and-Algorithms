/*
Your input
[1,3]
[2]
Output
2.00000
*/
public class Median {
    public static double find(int[] arr,int[] arr1){   
    int length = nums1.length + nums2.length;
        int []merged = new int[length];
        int i =0;
        int j =0;
        int k=0;

        while(i<nums1.length && j< nums2.length){
            if(nums1[i]<nums2[j]){
                merged[k]=nums1[i];
                i++;
                k++;
            }else{
                merged[k]=nums2[j];
                j++;
                k++;
            }
        }

        while(i<nums1.length){ // if value left in 1st array.
            merged[k]=nums1[i];
            i++;
            k++;
        }

        while(j<nums2.length){ // if i reached end. or 2nd array left data.
            merged[k]=nums2[j];
            j++;
            k++;
        }
        // size check merge array size odd or even.
        double median = 0.0;
        int mid = merged.length/2;
        if(merged.length %2==1){ // odd
                median  = merged[mid];
        }else{  // even
            // even case . 1 2 3 4 5 6 7 8   4+5 9 -8
            median = (merged[mid]+merged[mid-1])/2.0;
        }

        return median;
          }

}


// main class
public class Main {
    public static void main(String []args){

       Median medianClass = new Median();
            int arr[] = {3,5,7,10,15};
            int arr1[] = {2,4,12};
//            3 5 7 10 15 2 4 12
//        15 + 10  25 / 2
            double medianResult =  medianClass.find(arr,arr1);
                System.out.print(medianResult);
    }
}