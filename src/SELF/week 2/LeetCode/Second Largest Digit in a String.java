
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