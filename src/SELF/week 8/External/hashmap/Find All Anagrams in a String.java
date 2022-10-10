import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
    public static  List<Integer> findAnagrams(String s2, String s1) {
        int n = s2.length();
        int k = s1.length();
        List<Integer> res = new ArrayList<Integer>();
        int pat[] = new int[26];
        int str[] = new int[26];
        for(char c : s1.toCharArray()) pat[c-'a']++;
        int start = 0;
        for(int end = 0; end < n; end++) {
            str[s2.charAt(end)-'a']++;
            if(end>=k){
                str[s2.charAt(start)-'a']--;
                start++;
            }
            if(Arrays.equals(str,pat)) {
              res.add(start);
            }
        }
    return res;
    }
  public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
      Scanner sc = new Scanner(System.in);
      int n =sc.nextInt();
      String s =sc.next();
      int m =sc.nextInt();
      String p =sc.next();
        List<Integer> miss=  findAnagrams(s,p);
          for(int i=0;i<miss.size();i++)
        {         
      System.out.print(miss.get(i)+" ");
        }
	}
}


working above.
below not working 1 case fail..


import java.util.*;

/**
 * Main
 */
public class Main {

    public static ArrayList<Integer> findAnagrams(int n, String s, int m, String p) {
        if(m > n) return new ArrayList<>();
        
        HashMap<Character, Integer> pFreqMap = new HashMap<>();
        for(int i = 0; i < m; i++) {
            char ch = p.charAt(i);
            pFreqMap.put(ch, pFreqMap.getOrDefault(ch, 0) + 1);
        }

        HashMap<Character, Integer> windowFreqMap = new HashMap<>();
        for(int i = 0; i < m; i++) {
            char ch = s.charAt(i);
            windowFreqMap.put(ch, windowFreqMap.getOrDefault(ch, 0) + 1);
        }

        int incIdx = m;
        int excIdx = 0;

        ArrayList<Integer> ans = new ArrayList<>();

        while(incIdx < n) {
            if(pFreqMap.equals(windowFreqMap) == true) {
                ans.add(excIdx);
            }

            char excChar = s.charAt(excIdx);
            if(windowFreqMap.get(excChar) == 1) {
                windowFreqMap.remove(excChar);
            } else {
                windowFreqMap.put(excChar, windowFreqMap.get(excChar) - 1);
            }

            char incChar = s.charAt(incIdx);
            windowFreqMap.put(incChar, windowFreqMap.getOrDefault(incChar, 0) + 1);

            incIdx++;
            excIdx++;
        }

        if(pFreqMap.equals(windowFreqMap) == true) {
            ans.add(excIdx);
        }

        return ans;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String s = scn.next();
        int m = scn.nextInt();
        String p = scn.next();

        ArrayList<Integer> ans = findAnagrams(n, s, m, p);
        for (Integer i : ans) {
            System.out.print(i + " ");
        }

        scn.close();
    }
}