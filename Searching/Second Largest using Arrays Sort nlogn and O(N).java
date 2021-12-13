
public class secondlargetEL {

// TC:-    O(n);
    public static void SecondLargest(int [] arr){
        // two pointer, two variable using in this.
        if(arr.length<2){
            System.out.println("doesn't excist");
            return;
        }
        int largest = Integer.MIN_VALUE; // minimum possible value.
        int secondL= Integer.MIN_VALUE;

        for(int i =0; i<arr.length; i++){
            if(arr[i]>largest){
                secondL=largest;
                largest=arr[i];
            }
            if(arr[i]!=largest && arr[i]>secondL){
                secondL=arr[i];
            }
        }
        if(secondL == Integer.MIN_VALUE){
            System.out.println("doesn't exist");
        }else{
            System.out.println("second largest "+secondL);
        }
    }
}




public class Main {
    public static void main(String []args){

        secondlargetEL found = new secondlargetEL();
        int arr[] = {-1,7,1,34,18};

        // 1st approach. sort array, but duplicated not working. or repeated array.
//        TC:- O(nlogn);
        /*
        int n = arr.length;
        if(n<2){
            System.out.println("not found");
            return;
        }
        Arrays.sort(arr);
        int secondLargest = arr[n-2];
        System.out.println("secound larget "+secondLargest);
*/
        //1st approach ending.

        // 2nd approach O(n);  repeated also work.
        found.SecondLargest(arr);
    }
}


//output:- 18