``https://www.hackerrank.com/challenges/three-month-preparation-kit-divisible-sum-pairs/problem?h_l=interview&isFullScreen=false&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=three-month-preparation-kit&playlist_slugs%5B%5D=three-month-week-one``

```
   public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
    // Write your code here
    int sum =0;
 for(int i=0; i<n; i++){
     for(int j=i+1; j<n; j++){
         if((ar.get(i)+ ar.get(j))%k==0 && i<j){
          sum++;   
         }
     }
 }
```

