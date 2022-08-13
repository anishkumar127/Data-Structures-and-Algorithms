// Recursive approach to check if an
// Array is sorted or not
import java.util.*;
class CkeckSorted {
	
	static int check(int arr[], int n)
	{
	
		if (n == 1 || n == 0)
			return 1;

	
		if (arr[n - 1] < arr[n - 2])
			return 0;

		return check(arr, n - 1);
	}


	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int [] arr= new int [n];
    for(int i=0; i<n;i++){
      arr[i] = sc.nextInt();
    }
	
		if (check(arr, n) != 0)
			System.out.println("No");
		else
			System.out.println("Yes");
	}
}
