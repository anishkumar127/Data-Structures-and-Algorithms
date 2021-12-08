public class Main {
    public static void main(String[] args) {
 // 5*4*3*2*1=120;
        int n = 5;
        int fact=1;
        for(int i =1; i<=n; i++){
            fact=fact*i;
        }
            System.out.print(fact);

//        ..... recussion
        int Rfact = 1;
        Rfact= Recursion(n);
        System.out.print(Rfact);
    }
    public static int Recursion(int n){
        if(n==0){
            return 1;
        }else{
            return n*Recursion(n-1);
        }

    }
}
