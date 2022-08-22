

// question was on leet code. 
// question is. second largest digit in a string.


/*


count []  = new int[10];

converting to character array.
if it is digit. then count the frequency of that character digit. 

 */


// hashing and frequency which i  was looking. 

class Solution {
    public int secondHighest(String s) {
        int[] count = new int[10];
        for (char ch : s.toCharArray())
            if (Character.isDigit(ch))
                count[ch - '0']++;

        for (int i = 9, cnt = 2; i >= 0; i--)
            if (count[i] > 0 && --cnt == 0)
                return i;

        return -1;
    }
}

