
class Solution {
    public static void convertToWave(int n, int[] a) {
   
        for(int i=0; i<a.length-1; i= i+2){
            int j = i+1;
            int temp = a[i];
            a[i]= a[j];
            a[j] = temp;
        }
    }
    
}
  