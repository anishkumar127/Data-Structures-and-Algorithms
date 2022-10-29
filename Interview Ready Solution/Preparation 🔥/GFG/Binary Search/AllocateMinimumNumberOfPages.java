// https://practice.geeksforgeeks.org/problems/allocate-minimum-number-of-pages0937/0
class AllocateMinimumNumberOfPages 
{
    //Function to find minimum number of pages.
    public static int findPages(int[]A,int N,int M)
    {
        //Your code here
        int max=A[N-1];
        int sum=A[0];
        int mid;
        
        if(N < M)
        return -1;
        
        for(int i=1; i<N ; i++){
            sum +=A[i];
        }
        
        while(max < sum){
            mid = max + (sum-max)/2;
            int studentCount=1;
            int internalSum=0;
            for(int i=0; i<N; i++){
                internalSum+= A[i];
                if(internalSum > mid){
                    studentCount++;
                    internalSum = A[i];
                }
            }
            if(studentCount > M)
                max = mid+1;
            else {
                sum=mid;
            }
        }
        return sum;
    }
}
