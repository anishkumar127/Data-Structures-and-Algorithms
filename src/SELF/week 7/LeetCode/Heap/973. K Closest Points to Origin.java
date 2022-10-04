# [973\. K Closest Points to Origin](https://leetcode.com/problems/k-closest-points-to-origin/)

## Description

Difficulty: **Medium**  

Related Topics: [Array](https://leetcode.com/tag/array/), [Math](https://leetcode.com/tag/math/), [Divide and Conquer](https://leetcode.com/tag/divide-and-conquer/), [Geometry](https://leetcode.com/tag/geometry/), [Sorting](https://leetcode.com/tag/sorting/), [Heap (Priority Queue)](https://leetcode.com/tag/heap-priority-queue/), [Quickselect](https://leetcode.com/tag/quickselect/)


Given an array of `points` where points[i] = [x<sub>i</sub>, y<sub>i</sub>] represents a point on the **X-Y** plane and an integer `k`, return the `k` closest points to the origin `(0, 0).

The distance between two points on the **X-Y** plane is the Euclidean distance (i.e., √(x<sub>1</sub> - x<sub>2</sub>)<sup>2</sup> + (y<sub>1</sub> - y<sub>2</sub>)<sup>2</sup>).

You may return the answer in **any order**. The answer is **guaranteed** to be **unique** (except for the order that it is in).

**Example 1:**

![](https://assets.leetcode.com/uploads/2021/03/03/closestplane1.jpg)

``
Input: points = [[1,3],[-2,2]], k = 1
Output: [[-2,2]]
Explanation:
The distance between (1, 3) and the origin is sqrt(10).
The distance between (-2, 2) and the origin is sqrt(8).
Since sqrt(8) < sqrt(10), (-2, 2) is closer to the origin.
We only want the closest k = 1 points from the origin, so the answer is just [[-2,2]].
```

**Example 2:**

```
Input: points = [[3,3],[5,-1],[-2,4]], k = 2
Output: [[3,3],[-2,4]]
Explanation: The answer [[-2,4],[3,3]] would also be accepted.
```

**Constraints:**

*   1 <= k <= points.length <= 10<sup>4</sup>
*   -10<sup>4</sup> < x<sub>i</sub>, y<sub>i</sub> < 10<sup>4</sup>


## Solution

Language: **Java**

```java
class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->compare(a,b));
        int n = points.length;
        
        for(int i=0; i<n; i++){
          pq.add(points[i]);
            if(pq.size()>k){
                pq.poll();
            }
        }
        
        int output[][]= new int [k][2];
        int index =0;
        while(!pq.isEmpty()){
            output[index++]= pq.poll();
        }
        return output;
    }
    private int compare(int [] one , int [] two ){
        double distance_1 = one[0]*one[0]+one[1]*one[1];
        double distance_2 = two[0]*two[0]+two[1]*two[1];
        return distance_1<distance_2?1:-1;
    }
}
```