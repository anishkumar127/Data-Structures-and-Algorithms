import java.util.*;

public class Main {
    static String maximum_length(String str) {
       // Your Code Here
        String[] words = str.split(" ");
        int length = 0;
         String ans ="";
        for(String word:words){
            if(length < word.length()){
                length = word.length();
                ans+=word;
            }
        }
        // return length;     max length;
        return ans;   // and word of max length;
        
    }

    public static void main(String args[]) {
        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        System.out.print(maximum_length(str));
    }
}







2nd way


import java.util.*;

public class Main {
    static int maximum_length(String str) {
       // Your Code Here
        int n = str.length();
        int max = 0;
        int len=0;
        
        for(int i=0; i<n; i++){
          if(str.charAt(i)!=' '){
            len++;
          }else{
            max = Math.max(len,max);
            len =0;
          }
        }
        
        // one more time last word.
        return Math.max(max,len);
    }

    public static void main(String args[]) {
        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        System.out.print(maximum_length(str));
    }
}


