import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
/*
input
7
0 1 2 4 5 6 7
6
output
1 2 4 5 6 7 0 
4
public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		int target=sc.nextInt();
		b=roateArr(a);
		for(int i=0;i<n;i++)
		System.out.print(b[i]+" ");
		System.out.print("\n"+search(b,target));
	}
	public static int search(int[] a, int target) {
        int start = 0, end = a.length - 1;
        int last = a[end];
        
        while (start < end) 
        {
            int mid = start + (end - start) / 2;
            if (a[mid] > last)
                start = mid + 1;
            else 
            end = mid;
        }
        if (target <= last) 
        end = a.length - 1;
        else 
        {
        end = start - 1;
        start = 0;
        }
        while (start <= end) 
        {
        int mid = start + (end - start) / 2;
        if (target > a[mid])
        start = mid + 1;
        else if (target < a[mid])
        end = mid - 1;
        else
        return mid;
        }
        return -1;
        }
	public static int[]roateArr(int[] a){
	    Random r = new Random();
        int rand = r.nextInt(a.length-1) + 1;
	   
	    int b[]=new int[a.length];
	    int idx=0;
	    for(int i=rand;i<a.length;i++)
	    {
	     b[idx]=a[i];
	     idx++;
	    }
	    for(int i=0;i<rand;i++)
	    {
	        b[idx]=a[i];
	        idx++;
	    }
	    return b;
	}
}
