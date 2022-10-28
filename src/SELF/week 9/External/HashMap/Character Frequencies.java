import java.io.*;
import java.util.*;

class Solution {
    public void characterFrequencies(String s) {
            // write code here
            Map<Character, Integer> map = new LinkedHashMap<>();
            for(int i=0; i<s.length(); i++){
                    char ch = s.charAt(i);
                    map.put(ch,map.getOrDefault(ch,0)+1);
                    
            }
            // System.out.print(map);
            System.out.println(map.size());
            for(int value:map.values()){
                    System.out.print(value+" ");
            }
        //      ArrayList<Integer>list = new ArrayList<>();
        // Map<Character,Integer> map = new LinkedHashMap<>();
        // for(int i=0;i<A.length();i++)
        // {
        //     char ch = A.charAt(i);
        //     map.put(ch,map.getOrDefault(ch,0)+1);
        // }
        // for(Map.Entry<Character,Integer> e : map.entrySet())
        // {
        //     list.add(e.getValue());
        // }
        // int[]res = list.stream().mapToInt(i->i).toArray();
        // return res;
    }
}

public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            Solution Obj = new Solution();
            Obj.characterFrequencies(s);
    }
}



Given a string A containing only lowercase characters. Find the frequencies of the characters in order of their occurrence.

Input Format
Given a string A.

Output Format
In the first line print a single integer representing the size of the frequency array.

In the second line, print the array of integers representing the frequencies of characters in order of their occurrence in the input string.

Example 1
Input

interviewbit
Output

8
3 1 2 2 1 1 1 1
Explanation

Characters in their order of occurence and frequecies are {'i', 3}, {'n', 1}, {'t', 2}, {'e', 2}, {'r', 1}, {'v', 1}, {'w', 1}, {'b', 1}.

Example 2
Input

scaler
Output

6
1 1 1 1 1 1
Explanation

Characters in their order of occurence and frequecies are {'s', 1}, {'c', 1}, {'a', 1}, {'l', 1}, {'e', 1}, {'r', 1}.

Constraints
1 <= |A| <= 10^5