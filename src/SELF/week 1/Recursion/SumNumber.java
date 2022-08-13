package Try;

public class SumNnumber {
    public static void main (String [] args){
        int ans = sum(5);
        System.out.print(ans);
    }
    private static int sum(int n){
        // base case
        if(n==0){
            return 0;
        }
        return n+sum(n-1);
    }
}
