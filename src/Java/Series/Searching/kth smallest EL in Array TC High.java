
public class findKthLargestandSmallest {
    public static void LandSkth(int arr[],int k){
        for(int i=0; i<arr.length-1; i++){
            for(int j =i+1; j<arr.length; j++){
                if(arr[i]<arr[j]){
//                    swap
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j]= temp;
                }
            }
            if(i==k-1){
                System.out.println("kth L eL "+arr[i]);
			break; // it will sort jaha tak kth //need  hai uske baad sort nahi krta hai. TC reduce.
            }
        }
    }
}


public class Main {
    public static void main(String []args){

        // kth largest elements in array.
        findKthLargestandSmallest find = new findKthLargestandSmallest();
        int [] arr={5,8,12,7,6,2,4};
        int k =4;
        find.LandSkth(arr,k);

    }
}

//output:- 6
