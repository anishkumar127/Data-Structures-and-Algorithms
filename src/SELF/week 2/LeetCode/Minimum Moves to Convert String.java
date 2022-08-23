
/*
Many of us can write the correct greedy strategy. But most discussions don't tell how it works and why it works here. If you are interested please read the following part:)

Here's my explanation:
1.Because one move have to change three consecutive characters together. Change 'OOO' is just a waste of opportunities. We can make list of all the possible situations:

// one X
OOX  OXO  XOO
//two X
XXO  XOX  OXX
//three X
XXX
And we define them as basic element here. All the move we will change is those basic elements.
2.There's some identical situations. eg.

//OOX is identical to XOO and OXO when the sequence is OOXOO
//XXO is identical to OXX when the sequence is OXXO
3.Those situations indicates that we can get the same result (remove some X) and move step despite the basic elements are different.
4.We can find an representative for group of elements and here comes with our greedy strategy: once we find an X, we add one to the steps and move the pointer 3 indexes away.

The basic idea of greedy strategy is to find the common part of situations so we can detect them using less operations. (Just like the find a dophine use the hump in its head.)
*/
class Solution {
    public int minimumMoves(String s) {
        int i=0;
        int step=0;
        while(i<s.length()){
            if(s.charAt(i)=='X'){
                i=i+3;
                step++;
            }
            else{
                i++;
            }
        }
        return step;
    }
}




/*
The important thing that you might be missing in your solution is that you might be counting 3 letter groups, which won't give you the correct answer.

Why?

The reason for this is a test case like this:

"XXXOXXOXOXO"
So, if you're counting letter groups of 3 at a time, you will count 1 for the first group XXX and then you will count 2 for OXX and then 3 for OXO and 4 for XO.

But this is not the minimum count, which in this case would be 3.

How?
You should count 1 for XXX and then 2 for XXO (skip O in between) and then 3 for XOX.

Basically, you should not be counting the Os which can be skipped.

Now that you know why this won't work, you might also get to the part that you should only increment your count when dealing with an X.

So a simple greedy approach would be something like this:
*/
class Solution {
    public int minimumMoves(String s) {
        int count = 0;
        
        for (int i = 0; i < s.length();) {            
            if (s.charAt(i) == 'X') {
                count++;
                i += 3;
            } else {
                i++;
            }
        }
        
        return count;
    }
}
// The greedy approach is that if we find an X we count a step immediately and skip over 3 (irrespective of X or O since we can deal it all in one step).





class Solution {
    public int minimumMoves(String s) {
      int moves = 0;
        int i=0;
        
        while(i<s.length())
        {
            if(s.charAt(i)=='X')
            {
                i+=3;
                moves++; // we just need to skip 3 places when it is x :-)
            }else
            {
                i++;
            }
            
        }      
        
        return moves;
    }
}








// greedy part.

s = "XXX"  1.
m  = 0;
i = 0;

i<3;

if(x==x) {
    i= i+3;   i=3;
    m= ++    m = 1;
}else
    
{
    i++;
}

// return move.


2.  XXOX

i<3
    if(x==x)
        i = 3;
m = 1;
else
{
    
}





// theory part.
/*

// edge cases.

if length<3 return.

if(string not contains X) return 0; or contians OOO then what. ?
lets assume if(string not contians X || O) return it;




*/
