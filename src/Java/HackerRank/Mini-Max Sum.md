``https://www.hackerrank.com/challenges/three-month-preparation-kit-mini-max-sum/problem``

```
public static void miniMaxSum(List<Integer> arr) {
    long maxSum=Integer.MIN_VALUE;
    long minSum=Integer.MAX_VALUE;
    long sum =0;
    for(int i=0; i<arr.size(); i++){

      maxSum = Math.max(arr.get(i),maxSum);
      minSum = Math.min(arr.get(i),minSum);
      
      sum +=arr.get(i);
    }
//    System.out.print(sum);
System.out.print((sum-maxSum)+" "+(sum-minSum));
    }

```