package Try;

public class SumOfDigit {
    public static void main(String[] args) {
       int ans = digit(1342);
       System.out.print(ans);
    }
    private static int digit(int n){

        // base case
        if(n==0){
            return 0;
        }
        return (n%10) + digit(n/10) ;
    }
}
