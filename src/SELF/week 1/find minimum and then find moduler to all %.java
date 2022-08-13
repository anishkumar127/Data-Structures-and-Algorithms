import java.util.*;
public class Solution
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
    int num3=sc.nextInt();
		int min=Math.min(num1,Math.min(num2,num3));
		       // (10,(15,20));
		// System.out.print(min); // 10. 
     int i; // 10;
		for(i=min;i>=1;i--){
		    if((num1%i==0) && (num2%i==0) && (num3%i==0)){
		      break;
		    }
	}  
		System.out.println(i);
		
		// 10%10  == 0;  && 15%10 20%10; no. 
		// 10%5 == 0;   && 15% 5 ==0 20%5==0. Yes.
		
	}
}