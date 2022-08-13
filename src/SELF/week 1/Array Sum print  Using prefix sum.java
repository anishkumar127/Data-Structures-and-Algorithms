import java.util.*;

public class Main {
  /*
  prefix sum. 
 input 1 2 3 4 
 output : 1 3 6 10 ;
  */
  
    public static void main(String[] args) {
      int nums[] = {1,2,3,4};
              for(int i = 1; i < nums.length; i++) {
            
            nums[i] = nums[i]+nums[i-1];
           
        }
        
        System.out.print(Arrays.toString(nums));
        
        /*
        
        */
       
        // System.out.print(nums[i]); // 3 6 10
            // System.out.print(nums[i-1]); // 1 3 6 
  }
}