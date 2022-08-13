package Try;

public class ReverseDigit1 {
    static int sum = 0;
    public static void main(String[] args) {
        reverseDigit1(2431);
        System.out.print(sum);
    }

    private static void reverseDigit1(int n){
        // base case
        if(n==0){
            return;
        }
        int rem = n%10;
        sum = sum *10 + rem;
        reverseDigit1(n/10);

    }
}
