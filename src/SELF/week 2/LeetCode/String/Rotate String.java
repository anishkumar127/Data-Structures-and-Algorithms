

/*
a = abcde  b = cdeab

example.  abcdeabcde  == contains cdeab 

if a+a.contains(b); true.


 */


class Solution {
    public boolean rotateString(String s, String goal) {
    return s.length()==goal.length() && (s+s).contains(goal);
    }
}





// We can use offset to check which two characters we should compare if shifted.

class Solution {
    public boolean rotateString(String s, String goal) {
        int n = s.length(), m = goal.length();
        if (m != n) return false;
        
        for (int offset = 0; offset < n; offset++) {
            if (isMatch(s, goal, offset)) return true;
        }
        return false;
    }
    
    private boolean isMatch(String s, String g, int offset) {
        int n = s.length();
        for (int si = 0; si < n; si++) {
            int gi = (si + offset) % n;
            if (s.charAt(si) != g.charAt(gi)) return false;
        }
        return true;
    }
}



// Best Solution for an Interview? [Java] Thoughts and takeaways
/*
There are a couple general solutions. The first is to do a naive O(n^2) time but O(1) solution. The second is to construct a larger string (A + A) and do a simple contains on it, which is shorter but uses O(n) memory. There is a third solution using rolling hashes that is O(n) in both time and space, and the KMP solution which is also O(n) in both, but can skip ahead depending on the prefix. There is also another solution using two-way string-matching https://en.wikipedia.org/wiki/Two-way_string-matching_algorithm that runs in O(n) time and O(1) space by cleverly splitting the string up into two partitions. I won't be going into it because it's beyond the scope of the question.

The thing is, if I were to give out this question, and the applicant gave out the KMP solution from memory, would I really be all that impressed? My interview isn't supposed to test if the interviewee memorized a string matching algorithm beforehand. The KMP solution is long and complicated. As such, it's easy to make a mistake when coding it, and it's harder to maintain than other solutions. Furthermore, the question itself says that the maximum string length is only 100. If you have to build up a whole table of shifts just to calculate if one string is in another, then KMP may be slower than the naive approach in practice, especially if the average string length is closer to 10.

Furthermore, I don't think questions like this are really intended to be as hard as KMP. It's a leetcode easy that would be used as a warm up to a harder problem involving graphs, or dynamic programming. I think a better strategy would be to note the assumptions in the question and to challenge those. For example, what if A and B are both null? Some discussion-given answers ignore the possibility of either being null, some return true if both are null, and some return false. But really, if I give a function two null strings, I would almost certainly want an exception to occur.
 */

class Solution {
    public boolean rotateString(String A, String B) {
        if(A == null || B == null) {
            //throw exception on A and B both being null?
            return false;
        }
        if(A.length() != B.length()) {
            return false;
        }
        if(A.length() == 0) {
            return true;
        }
        for(int i = 0; i < A.length(); i++) {
            if(rotateString(A, B, i)) {
                return true;
            }
        }
        return false;
    }
    
    private boolean rotateString(String A, String B, int rotation) {
        for(int i = 0; i < A.length(); i++) {
            if(A.charAt(i) != B.charAt((i+rotation)%B.length())) {
                return false;
            }
        }
        return true;
    }
}
/*
Here is my first solution. I just used the naive solution. It took me about 5 minutes to write it. I think there are some improvements that could be made, for example you could argue that not using braces for simple if statements, and using A.isEmpty() instead of A.length() == 0 for the empty check. You could consider merging the first two false cases. I think that using a function for the inner loop is better than not using one, because not only is that function potentially reusable, it is also easier to document. It's fairly simple to understand what the private function is doing just from the parameters.

I think an ideal interview would start off with a solution by this, making sure to ask about the length of average strings, whether or not this is a hot code path, and the possibility of using an exception rather than just returning false. Then, describe the time and space complexity of this solution. Then, if you have more time, press to figure out the KMP solution to get down to linear time. If you don't feel confident you can figure out the better time complexity answer, then at least describe to the interviewer the possiblity of creating one by using more space.
 */















/*
// in which i assume left pushing to back. and checking equal to goal or not. 
// a bcde
// bcdea

// bcde a

// ab cde 
// cdeab
// cde ab


// //
// // abcde
// // cdeab

// abcde 
// abcde // true
// abced // false

// abcde
// abced 
// abced
 */

