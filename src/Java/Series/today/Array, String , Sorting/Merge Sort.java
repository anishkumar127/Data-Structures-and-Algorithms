// n *logn
// nlogn
public class SorttMerge {
int[] array;
    int[] tempMergeArray;
    int length;
// function
    public void Merging(int[] arr){

        this.array = arr;
        this.length= arr.length;
        this.tempMergeArray= new int[length];
        DivideArr(0,length-1);

    }
    public void DivideArr(int low, int high){
        if(low<high){
            int mid = (low+high)/2;
            DivideArr(low,mid);
            DivideArr(mid+1,high);
            MergeArray(low,mid,high);
        }
    }
    public void MergeArray(int low, int mid, int high){
        for(int i=low; i<=high; i++){
            tempMergeArray[i]=array[i];
        }

        int i =low;
        int j = mid+1;
        int k = low;

        while(i<=mid && j<= high){
            if(tempMergeArray[i]<=tempMergeArray[j]){
                array[k]=tempMergeArray[i];
                i++;
            }else{
                array[k]=tempMergeArray[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            array[k]=tempMergeArray[i];
            k++;
            i++;
        }
    }
}


//.. main method


public class Main {
    public static void main(String[] args) {
       SorttMerge sort = new SorttMerge();
        int arr[]= {3,5,8,4,1,9};
        int[] tempMergeArray;
       sort.Merging(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}

