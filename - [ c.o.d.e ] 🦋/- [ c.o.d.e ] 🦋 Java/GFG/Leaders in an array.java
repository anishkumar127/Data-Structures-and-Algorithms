                            // using ArrayList


class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        ArrayList <Integer> ans = new ArrayList<>();

        // edge cases.
        if(arr.length==0){
            return null;
        }
        if(arr.length==1){
           ans.add(arr[0]);
          return null;
            
        }

        ans.add(arr[arr.length-1]); // added last elements.
        int max = arr [arr.length-1]; // excume last elements is leader elements.
        for(int i=arr.length-2; i>=0; i--){
            if(arr[i]>=max){
                max = arr[i];
                ans.add(arr[i]);
            }
          
        }
         Collections.reverse(ans); // reversing the list.
        return ans;
    }
}
