
import java.util.*;
public class Main
{
// making scanner static for use scanner all the function. 
// in this code we r doing factorial and printing array only.
// basic function approach 
  static Scanner sc=new Scanner(System.in);
  public static void Factorial(int n){
    int fact = 1;
    for(int i=1; i<=n; i++){
    fact = fact*i;
    }
       System.out.println(fact);
  }

    public static void PrintArray(int t){
      
    
  int [] arr=new int[t];
  
  for(int i=0; i<t; i++){
      arr[i]= sc.nextInt();
    }
    for(int j=0; j<t; j++){
      System.out.println(arr[j]);
    }
  }
  
	public static void main(String[] args) {

  // Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int t = sc.nextInt();

  Factorial(n);
  PrintArray(t);
  
	}
}

