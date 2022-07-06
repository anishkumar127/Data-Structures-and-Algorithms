public class Main {
    public static void main(String[] args) {  
   int arr[] = {5,6,7,3,4,5,3,1,2,3,5,4,3,1,2,6,7,8,9,9,8,7,8,7,8,7,8,9,0,2,3};
//        int arr[] = {5,5,3,2,1,1,8};
//        output:- 567341289
//        Arrays.sort(arr);
        int n = arr.length;
        int count ;
        for(int i=0; i<n; i++){
            count =1;
            for(int j=i+1; j<n; j++){
                if(arr[i]==arr[j] && arr[i]!=0){
                    count++;
                    arr[j]=0;
                }
            }
            if(count>1 && arr[i]!=0){
                System.out.print(arr[i]);
            }
        }
    }
}