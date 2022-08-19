/*
"abccccdd" 
a - 1
b = 1
c = 4
d = 2;

palindrome length could be even or odd.
even  abc|cba   
odd   aabc|d|cbaa // all character occurrence even and 1 character odd on middle.  

[all even count + all odd -1] +1 .. +1 when odd. when even not. +1 optional.



 */

//  9ms/
class Solution {
    public int longestPalindrome(String s) {
        
        Map<Character,Integer> counts = new HashMap<>();
        
        for(char ch:s.toCharArray()){
            counts.put(ch,counts.getOrDefault(ch,0)+1);
        }
        
        int length =0;
        boolean odd_found=false;
        for(int c :counts.values()){
            if(c%2==0){
                length+=c;
            }else{
                odd_found=true;
                length+=c-1;
            }
        }
        
        if(odd_found){
            length++;
        }
        return length;
    }
}




// hashset 9ms

class Solution {
    public int longestPalindrome(String s) {
        
      if(s==null || s.length()==0){
          return 0;
      }
      
        HashSet<Character> hs = new HashSet<>();
        
        int count =0;
        for(int i=0; i<s.length(); i++){
            if(hs.contains(s.charAt(i))){ // if hash contains already that value.
                hs.remove(s.charAt(i));   // remove it from hash.
                count++;                    // increase the count.
            }else{
                hs.add(s.charAt(i));        // not present then add it.
            }
        }
        if(!hs.isEmpty()){                  // if not empty;
            return count *2+1; // odd   c c d count 3 *2 +1 = 7
        }
        return count*2; // even 
    }
}



//set

// Noticed the unit of constructing palindrome is pair of char. So we don't need to count Characters but just make a minus.
// Refer to this code, it's self-explanatory.

public int longestPalindrome(String s) {
	Set<Character> set = new HashSet<>();
	for (char c : s.toCharArray()) {
		if (set.contains(c)) {
			set.remove(c);
		} else {
			set.add(c);
		}
	}
	int baseSize = s.length() - set.size();
	if (set.size() != 0) return baseSize + 1;
	return baseSize;
}



// array hashing

class Solution {
    public int longestPalindrome(String s) {
        int[] map=new int[128];
        int ans=0;
        boolean flag=false;
        for(char c:s.toCharArray()){
            map[c]++;
        }
        for(int i:map){
            if(i%2==0){
                ans+=i;
            }
            else{
                ans+=i-1;
                flag=true;
            }
        }
        if(flag)
            return ++ans;
        return ans;
    }
}


// good one

 public int longestPalindrome(String s) {
        int arr[]= new int[128];
        int count=0;
        for(char ch : s.toCharArray()){
            arr[ch]++;
            
        }
        for(int i=0;i<128;i++){
            if(arr[i]%2==0){
                count+=arr[i];
            }else{
                count+=arr[i]-1;
            }
        }
        if(count<s.length()) return count+1;
        return count;
    }

    
