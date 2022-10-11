```Java
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) {
        // your code here
            Scanner sc = new Scanner(System.in);
            String st = sc.nextLine();
            String min_word ="";

            st = st.trim(); // space trim.
        int min_length = st.length();
            int size = st.length();
            int max_length=0;
            int min_start=0;
            int s = 0;
            int e = 0;

            while(e<=size){
                    if(e<size && st.charAt(e)!=' '){
                            e = e+1;
                    }else{
                            int  c_length= e -s;
                            if(c_length<min_length){
                                    min_length = c_length;
                                    min_start = s;
                            }
                            e++;
                            s=e;
                    }
            }
            min_word = st.substring(min_start,min_start+min_length);
            System.out.print(min_word);
    }
}
```