
// tc : n of words*length sc O(n);

// 66 ms 

class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> list = new ArrayList<>();
        int start=0;  // comapring
        
        if(words.length>1){
            
            int i=1;  // starting from 1.
            for(; i<words.length-1;){
                if((i+1<words.length) && (freq(words[start])).equals(freq(words[i]))){  // 0 ==1 , 1 ==2
                    i++; 
                }else{
                    list.add(words[start]);
                    start  = i; 
                    i++;
                }
            }
                    list.add(words[start]);
                                if(!(freq(words[start])).equals((freq(words[words.length-1])))){
                    list.add(words[words.length-1]);
                                }
                            }else{
                    list.add(words[start]);
        }
                return list;
    }
    
    private String freq(String word){
        int [] freq = new int[26];
        
        for(char ch:word.toCharArray()){
            freq[ch-'a']++;
        }
        
        String convertedToString="";
        for(int el:freq){
            convertedToString+=el;
        }
        return convertedToString;
    }
}






Method 1

class Solution {
    public List<String> removeAnagrams(String[] words) {
        String prev ="";
        List<String> li=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            char[] ch=words[i].toCharArray();
            Arrays.sort(ch);
            String curr=String.valueOf(ch);
            if(!curr.equals(prev)){
                li.add(words[i]);
                prev=curr;
            }
        }
        return li;
    }
}
Method 2

class Solution {
    public List<String> removeAnagrams(String[] words) {
        Stack<String> stack = new Stack<>();
        for(int i = words.length-1;i>= 0;i--){
            String s = words[i];
            while(!stack.isEmpty() && anagram(stack.peek(),s) == true)stack.pop();
            stack.push(s);
        }
        List<String> res = new ArrayList<>();
        while(!stack.isEmpty())res.add(stack.pop());
        return res;
    }
    
    public boolean anagram(String p,String q){
        int arr[] = new int[26];
        for(char i : p.toCharArray())arr[i-'a']+=1;
        for(char i : q.toCharArray())arr[i-'a']-=1;
        for(int i : arr)if(i != 0)return false;
        return true;
    }
}



Description:

For every we will put our first pointer at a string and second pointer at the next position of first pointer.
Keep on moving the second pointer by one step ahead if the string it is pointing is a anagram of string at first pointer.
If we found a string pointed by second pointer is not an anagram of string at first pointer then put string at first pointer in the answer array.
Instead of deleting words, we will skip it, this will save our time.

public List<String> removeAnagrams(String[] A) {
    List<String> ans= new ArrayList<>();
    int n= A.length;
    for(int i=0;i<n;){
        int j=i+1;
        while( j<n && isang(A[i],A[j]) ) j++;
        ans.add(A[i]);
        i=j;
    }
    return ans;
}
//function for checking if two string are anagrams or not
boolean isang(String p,String q){
    int[] cnt= new int[26];
    int res=0;
    for(int i=0;i<p.length();i++) cnt[p.charAt(i)-'a']++;
    for(int i=0;i<q.length();i++) cnt[q.charAt(i)-'a']--;
    for(int i:cnt) if(i!=0) return false;
    return true;
}
Time - O(N * M)
Space - O(1)



Java O(N^2) ||  solution with comments to understand , 2 pointer method

class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < words.length;) {
		// we will run loop from 0 to words.length for i.
            int j;
            for (j = i + 1; j < words.length; j++) {
			// we will check if anagram strings or not
			// if not then we will break the looop
                if (!isAnagram(words[i], words[j])) {
                    break;
                }
            }
			// after breaking the loop we will add our first anagram number ar ith index 
			//after that we will set i to j
            ans.add(words[i]);
            i = j;
        }

        return ans;
    }
	
	// function to know wheather two strings are anagram or not
    boolean isAnagram(String s, String t) {
	
	//if lengths of both strings is not equal they cannot be anagram
        if (s.length() != t.length()) {
            return false;
        }
		
		//conver the both strings into the character arrays
        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();
		
		//sort the respectively both arrays
        Arrays.sort(c1);
        Arrays.sort(c2);

		// check if elements of both sorted arrays are equal or not
        for (int i = 0; i < c2.length; i++) {
            if (c1[i] != c2[i]) {
			// if elements are not equal then return false.
                return false;
            }
        }
		// loop over means all the elements are equal so it is anagram reutrning true
        return true;
}
}



//



class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> ans = new ArrayList<>();
        String prev = "";
        
         for (int i = 0; i < words.length; i++) {
             if(!isAnagram(words[i],prev)){
                 ans.add(words[i]);
             }
             prev = words[i];
             
         }
        return ans;
    }
    
    public boolean isAnagram(String s1, String s2) {
        if(s1.length() != s2.length()) {
            return false;
        }
        //store frequency of s1 and s2. for s1 character add 1 and for s1 subtract 1
        int[] freq = new int[26];
        // prepare freq map till s1 length
        for (int i = 0; i < s1.length(); i++) {
			freq[s1.charAt(i) - 'a'] += 1;
			freq[s2.charAt(i) - 'a'] -= 1;
		}
        
        return checkAnagram(freq);
    }
    //check if freq map has all zero. it will be true for anagram
    private boolean checkAnagram(int[] freq) {
        for(int i=0;i<freq.length;i++) {
            if(freq[i]!=0) {
                return false;
            }
        }
        return true;
    }
}



Java Brute force (Bad Time Complexity code)


class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> res = new ArrayList<>();
        for(String word : words){
            res.add(word);
        }
        int i = 0;
        while(i < res.size()-1){
            int j = i+1;
            while(j<res.size()){
                if(!isAnagram(res.get(i), res.get(j))){
                    i = j;
                    break;
                }
                else{
                    res.remove(j);
                }
            }
        }
        return res;
    }
    public boolean isAnagram(String s, String t){
        char c1[] = s.toCharArray();
        char c2[] = t.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(char c : c1){
            sb1.append(c);
        }
        for(char c : c2){
            sb2.append(c);
        }
        return sb1.toString().equals(sb2.toString());
    }
}



// brute force 

public List<String> removeAnagrams(String[] words) {
        List<String> list = new ArrayList<>();
        String next = " ";
        for (int  i = 0; i < words.length; i++) {
            char[] temp = words[i].toCharArray();
            Arrays.sort(temp);
            String temp2 = new String(temp);
            if (!temp2.equals(next)) {
                list.add(words[i]);
            }
            next = temp2;
        }
        return list;
    }


    