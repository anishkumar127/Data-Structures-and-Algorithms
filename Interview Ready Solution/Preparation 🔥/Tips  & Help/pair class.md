```java
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
            PriorityQueue<pair> q = new PriorityQueue<>((x ,y)-> y.first - x.first);
            String[]res = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            q.add(new pair(heights[i],names[i]));
        }
        int index = 0;
        while (!q.isEmpty()){
            res[index++] = q.poll().second;
        }
        return res;
    }
}
class pair {
    public pair(Integer first, String second) {
        this.first = first;
        this.second = second;
    }

    Integer first;
    String second;
}
```