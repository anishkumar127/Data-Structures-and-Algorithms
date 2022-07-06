import java.util.*;
/*
input:- mynameisanish
output:- mnais

*/
public class Main {
    public static void main(String[] args) {
        String name = "mynameisanish";
        char chArr[]= name.toCharArray();
        for(int i=0; i<name.length(); i++){
          for( int j=i+1; j<name.length(); j++){
            if(chArr[i]==chArr[j]){
              System.out.print(chArr[j]);
              break;
            }
          }     
        } 
    }
}