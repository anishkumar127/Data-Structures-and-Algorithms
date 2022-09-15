// 65 ms

class Solution {
    public int firstUniqChar(String s) {
        int n = s.length();
        HashMap<Character,Integer>map = new HashMap<>();
        
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0; i<n; i++){
            if(map.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}



// 70 ms

class Solution {
    public int firstUniqChar(String s) {
        int n = s.length();
        HashMap<Character,Integer>map = new HashMap<>();
        
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0; i<n; i++){
            if(map.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}


// 8 ms without hashmap.

class Solution {
    public int firstUniqChar(String s) {
        int n = s.length();
        // creating frequency array.
        int[] freq = new int[26]; 
        
        for(int i=0; i<n; i++){
            char every_ch = s.charAt(i);
            freq[every_ch-'a']++; //        OR  freq[every_ch-'a']= freq[every_ch-'a']+1;
        }
        
        // searching in freq array.
        for(int i=0; i<n; i++){
            char every_ch = s.charAt(i);
            if(freq[every_ch-'a'] ==1){
                return i;
            }
        }
        
        return -1;
    }
}