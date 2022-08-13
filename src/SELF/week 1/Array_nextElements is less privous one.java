import java.util.*;
/*
5
 5 3 3 2 11
 output: No
 5
 5 3 3 2 1
 output: Yes 
 
 Array next elements is less then previous one. 
*/
class Main {

	static boolean check(int arr[], int n)
	{

		if (n == 0 || n == 1)
			return true;

		for (int i = 1; i < n; i++)

			if (arr[i - 1] < arr[i])
				return false;
		
		return true;
	}


	public static void main(String[] args)
	{
Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int [] arr= new int [n];
    for(int i=0; i<n;i++){
      arr[i] = sc.nextInt();
    }

		if (check(arr, n))
			System.out.print("Yes\n");
		else
			System.out.print("No\n");
	}
}
