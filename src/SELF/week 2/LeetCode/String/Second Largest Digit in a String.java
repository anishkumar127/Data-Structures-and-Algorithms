
class Solution {
    public int secondHighest(String s) {
      int LargestDigit = -1;
      int secondLargestDigit = -1;
        
        for(char every_ch:s.toCharArray()){         // converting to character Array.
            if(Character.isDigit(every_ch)){            // if it is digit.
                int maxFinder = Character.getNumericValue(every_ch);        // finding the that digit numeric value.
                if(maxFinder>LargestDigit){                 // finding max and second max.
                    secondLargestDigit= LargestDigit;
                    LargestDigit = maxFinder;
                }else if(maxFinder>secondLargestDigit && maxFinder!=LargestDigit){
                    secondLargestDigit = maxFinder;
                }
            }
        }
        
        return secondLargestDigit; // returning the second max.
    }
}


// pq and hashset.
// 5-7 ms
class Solution {
    public int secondHighest(String s) {
     Set<Integer> set = new HashSet<>();
        PriorityQueue<Integer>pq = new PriorityQueue<>((a,b)->b-a); // return max first. reverse order.
        // java follow min heap.
        
        int pointer =0; // for iterating over the n elements.
        
        while(pointer<s.length()){
            char every_ch = s.charAt(pointer);
            
            if(Character.isDigit(every_ch)){
                if(!set.contains(every_ch-'0')){ // if not contains digit set then push pq and set in both.
                    pq.add(every_ch-'0');  //  every_ch-'0' // converting character to digit.
                    set.add(every_ch-'0');
                }
            }
            pointer++; // iterating.
        }
        int secondLargestDigit =0;
        if(pq.size()<2){
            secondLargestDigit =-1;
        }else if(pq.size()>1){  // greater than 1 or greater then >= 2;
            pq.poll();  // first times removed elements.
            secondLargestDigit = pq.poll(); // second times removing. and assigning into variable.
        }
        
        return secondLargestDigit; // returning the second largest Digit.
    }
}


















// Silly Mistakes which people do in general:
// 1. Order of updation is important i.e dont update largest first then secondLargest to largest.
// 2. Miss the thing that duplicates are there.





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



Idea is
1.store all digits(Store in HashSet so that dont have to face duplicate digit problem)
2.Update largest and second largest accordingly

Solution 1:

    public int secondHighest(String s) {
        int largest=-1;
        int secondLargest=-1;
        
        HashSet<Integer> digits=new HashSet<>();
        for(char ch:s.toCharArray()){
          if(ch>='0' && ch<='9'){
             int digit=ch-'0';
              digits.add(digit);
          }
        }
        
        for(int digit:digits){
            if(digit>largest){
                secondLargest=largest;
                largest=digit;
            }else if(digit>secondLargest){
                secondLargest=digit;
            }
        }
      
        return secondLargest;
    }
Time:O(N) but Space : O(unique_digits) at worst case O(N) :(

So let us now optimise the space

Solution 2: Time:O(N) and Space:O(1)

    public int secondHighest(String s) {
        int largest = -1, secondLargest = -1;
		
        for (int i = 0; i < s.length(); ++i) {
            char ch= s.charAt(i); 
		
			 if(!Character.isDigit(ch)) continue;  // bcz we want digits only
			 
            int digit = ch - '0';
            if ( digit > largest) {
               largest=secondLargest;
			   largest=digit;                             
            }else if (digit < largest && digit > secondLargest) {  
                secondLargest = digit;
            }
        }
        return secondLargest;
    }

// Silly Mistakes which people do in general:
// 1. Order of updation is important i.e dont update largest first then secondLargest to largest.
// 2. Miss the thing that duplicates are there.



// easy one 

class Solution {
    public int secondHighest(String s) {
        int first = -1;
        int second = -1;
        for (int i=0; i<s.length(); i++) {
            char current = s.charAt(i);
            if (Character.isDigit(current)) {
                int value = current - '0';
                if (value > first) {
                    second = first;
                    first = value;
                }
                else if (second < value && value < first) {
                    second = value;
                }
            }
        }
        return second;
    }
}



// Java solution using TreeSet/SortedSet


class Solution {
    public int secondHighest(String s) {
        SortedSet<Character> set = new TreeSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i)))
                set.add(s.charAt(i));
        }
        if (set.size() > 1) {
            set.remove(set.last());
            return set.last() - '0';
        } else {
            return -1;
        }
    }
}



With TreeSet
With Array(Extra space)
Without Extra Data Structure(constant space and faster than 99%)
1: With TreeSet

public int secondHighest(String s) {
        TreeSet<Integer>pq= new TreeSet<>((a,b)->b-a);
        for(var c:s.toCharArray())
        {
            if(Character.isDigit(c))
            {
                pq.add(Integer.parseInt(c+""));
            }
        }
        if(pq.size()<2)
            return -1;
        Iterator<Integer> itr = pq.iterator();
        
        itr.next() ;
        return itr.next();
    }
2)Without Tree Set(BetterTime Complexity)

 public int secondHighest(String s) {
     int arr[]=new int[10];
     for(var c:s.toCharArray())
    {
         if(c>='0' && c<='9')
             arr[c-'0']++;
     }
     PriorityQueue<Integer>pq= new PriorityQueue<>();
     for(int i=9;i>=0;i--)
     {
         if(arr[i]!=0)
             pq.add(i);
         if(pq.size()==2)
             return pq.poll();
     }
     return -1;
     
 }
 
 
3: Without Extra Data Structure (optimized)


 public int secondHighest(String s) {
     char first='/',second='/';
     for(var c:s.toCharArray())
     {
         if(c>='0' && c<='9')
         {
             if(first=='/')
             {
                 first=c;
             }
             else if(first<c)
             {
                 second= first;
                 first= c;
             }
             else if(second<c)
             {
                 if(c!=first)
                 second=c;
             }
         }
     }
     return (second!='/' && second==first)?-1 : second-'0';
 }



class Solution {
    public int secondHighest(String s) {
        Set<Integer> set = new HashSet<>();
        
        for(char c: s.toCharArray()){
            if(Character.isDigit(c))
            {
                int num = c - '0';
                set.add(num);
            }
        }
        
        Object[] array = set.toArray();
        if(array.length > 1)
        {
            return (int) array[array.length - 2];
        }
        return -1;
    }
}

// array list

class Solution{
public int secondHighest(String s) {
   ArrayList<Integer> map = new ArrayList<>();
    for(int i=0;i<s.length();i++)
    {
        if(Character.isDigit(s.charAt(i)))
        {
            int a = s.charAt(i)-'0';
            if(!map.contains(a)) map.add(a);
        }
    }
    Collections.sort(map);
    if(map.size()>1)
    {
        return map.get(map.size()-2);
    }
    return -1;
 }
}