/*
Sample Input:
2
5
4
Sample Output:
2
2
*/
class Main {
	static long square_root(long n){
// aproach 1 don't know optimize or not. there one more
using binary search.
//   int number = 4;
        int i=1;
        int data = 1;
         while(data<=n){
           i++;
        //   4
        //   4*4 
        // 9   3 3*3 
           data = i*i;
              // 4    2*2
         }
            //  System.out.print(i-1);
			 return i-1;

}