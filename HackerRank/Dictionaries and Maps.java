
/*

input:-
3
sam 99912222
tom 11122222
harry 12299933
sam
edward
harry

output:-
sam=99912222
Not found
harry=12299933

*/
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
             Map <String, Integer> contacts = new HashMap<String,Integer>();
            
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();

       contacts.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
           
            if(contacts.containsKey(s)){
                System.out.println(s+"="+contacts.get(s));
            }else{
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
