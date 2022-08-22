/**
s.charAt(i) -'a' is the the number of a letter in alphabet order
for example 'z'-'a' is the 26 which is the last letter in alphabet
in ther word s.charAt(i) -'a' is the order of s.charAt(i) in alphabet order

 */
public int maxLengthBetweenEqualCharacters(String s) {
	int[] arr = new int[26];
	int max = -1;
	for(int i = 0 ; i < s.length() ; i++) arr[s.charAt(i) - 'a'] = i; 
	for(int i = 0 ; i < s.length() ; i++) max = Math.max((arr[s.charAt(i) -'a'] - i - 1),max);
	return max;
}
