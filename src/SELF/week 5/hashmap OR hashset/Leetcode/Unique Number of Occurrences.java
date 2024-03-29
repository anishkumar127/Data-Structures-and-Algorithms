4ms


class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        
        // put value inside hashmap.
        
        for(int i=0; i<n; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        
        // using set hash set for unique value.
        HashSet<Integer> set = new HashSet<>();
        
        // put map value inside hashset. using forEach loop.
        
        for(int el :map.values()) set.add(el);
        
        return (set.size()==map.size());  // if set and map size are equal then there are unique element.
    }
}



3ms

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        
        // put value inside hashmap.
        
        for(int i=0; i<n; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        
        // using hash set for unique value.
        HashSet<Integer> set = new HashSet<>();
        
        // put map value inside hashset. using forEach loop.
        // make decision earlier.
        for(int el :map.values()){
            if(!set.add(el)){       // if no duplicate then put into set.
                return false;     // if found duplicate return false. keep putting until not duplicate found.
            }
        } 
        
        return true;  //if all unique return true.
    }
}
