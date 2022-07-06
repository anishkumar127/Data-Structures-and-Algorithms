public class Main {
    public static void main(String[] args) {  
int n =153;
        int arm  = 0;
        int reminder = 0;
        int temp =n; // expriment. original value store. compare to original value. 
        while(n>0){ // 15>0
            reminder= n%10;  // reminder 3 
            arm=(reminder*reminder*reminder)+arm; // 3*3*3 = 27+0 = 27 
            n=n/10; // 15
        }
        if(temp==arm){
            System.out.print("YES ArmStrong");
        }else{
            System.out.println("NO");
        }

    }
}