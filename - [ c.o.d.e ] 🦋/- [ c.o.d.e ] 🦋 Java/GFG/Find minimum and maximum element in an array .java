

                            // using tree data structure.
class Compute 
{
    static pair getMinMax(long a[], long n)  
    {
    
        TreeSet<Long> tree = new TreeSet<>();
        for(long  arr : a){
            tree.add(arr);
        }
        
        return new pair (tree.first(), tree.last());
    }
}



                    // using one loop and min max.


class Compute 
{
    static pair getMinMax(long a[], long n)  
    {
        //Write your code here
        long max = Integer.MIN_VALUE;
        long min = Integer.MAX_VALUE;
        
        for(int i =0; i<a.length; i++){
            if(a[i]>max){
                max = a[i];
            }
            if(a[i]<min){
                min = a[i];
            }
        }
        return new pair(min,max);
    }
}



                            // 3


      int n = arr.length;
      int j =n-1;
      int min = arr[0];
      int max = arr[0];
      while(j>0){
        if(arr[j]>max){
          max=arr[j];
        }
        if(arr[j]<min){
          min=arr[j];
        }
        j--;
      }
      System.out.print(min+" "+max);


                                //4


public class Main {
    public static void main(String[] args) {
     
      int n = arr.length;
          int ans = 0;
          int i = 0;
          int j = n-1;
          while(i<j){
              if(arr[j]>arr[i]){
                 j--;
              }else{
                  i++;
              }
         }
             ans = arr[i];
            System.out.print(ans);
    }
}