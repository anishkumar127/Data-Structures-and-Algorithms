import java.util.*;
class Main {
	public static void main (String[] args) {
                      
         Scanner sc = new Scanner(System.in);
         String s = sc.next();
         System.out.print(StringLength(s));
	}
    static int StringLength(String S){
        int n = S.length();
        int sum = 0;
        for(int i=0; i<n; i++){
            sum+=(int)S.charAt(i)-(int)'0';
            // charAt(i) 1 = int = 49 , 0 = null = int = 48;
            //  49  - 48;
             // 1
            // 50 - 48; = 2
            //51 - 48 ; = 3
        }
        return sum;
    }
}