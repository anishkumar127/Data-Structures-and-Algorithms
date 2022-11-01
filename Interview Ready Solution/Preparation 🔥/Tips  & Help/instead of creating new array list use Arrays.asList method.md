
```java
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        int min_diff = Integer.MAX_VALUE;
        for(int i=1; i<arr.length; i++){
            min_diff = Math.min(arr[i]-arr[i-1],min_diff);
        }
        
        for(int i=1; i<arr.length; i++){
            if(arr[i]-arr[i-1]==min_diff){
                ans.add(Arrays.asList(arr[i-1],arr[i]));
            }
        }
        return ans;
    }
}

```

```java
Arrays.asList(start,end);
start i and end i+1;
```