import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        // your code here
Scanner sc = new Scanner(System.in);
      int n= sc.nextInt();
      int stones[] = new int[n];
      for(int i=0; i<n; i++){
        stones[i] = sc.nextInt();
      }

                    PriorityQueue<Integer>pq = new PriorityQueue<>((p1,p2)->(p2-p1)); // max heap 
        
        for(int value:stones){
            pq.add(value);
        }
        
        int stone = pq.poll();
        while(pq.size()>0){
            int diff = stone-pq.poll(); // first max and second max - minus.
            
            if(diff!=0){
                pq.add(diff);
            }
            if(pq.size()==0){
                stone =0;  // if pq empty then return 0; stone.
            }else{
                stone = pq.poll(); // next next poll assign into next stone.
            }
        }
        System.out.print(stone);
    }
}



You are given an array of integers stones where stones[i] is the weight of the ith stone.

We are playing a game with the stones. On each turn, we choose the heaviest two stones and smash them together. Suppose the heaviest two stones have weights x and y with x <= y. The result of this smash is:

If x == y, both stones are destroyed, and If x != y, the stone of weight x is destroyed, and the stone of weight y has new weight y - x. At the end of the game, there is at most one stone left.

print the smallest possible weight of the left stone. If there are no stones left, print 0.

Input:
The first line contains a single integer n(size of array n) The next line contains n integers

Output:
print the smallest possible weight of the left stone. If there are no stones left, print 0.

Constraints
1 <= stones.length <= 30
1 <= stones[i] <= 1000
Sample Input 1
6
2 7 4 1 8 1
Sample Output 1
1
Explanation
We combine 7 and 8 to get 1 so the array converts to [2,4,1,1,1] then,
we combine 2 and 4 to get 2 so the array converts to [2,1,1,1] then,
we combine 2 and 1 to get 1 so the array converts to [1,1,1] then,
we combine 1 and 1 to get 0 so the array converts to [1] then that's the value of the last stone.
Sample Input 2
1
1
Sample Output 2
1