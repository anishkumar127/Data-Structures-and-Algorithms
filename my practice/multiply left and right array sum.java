code 1; 
class Complete{
    
    // Function for finding maximum and value pair
    public static int multiply (int arr[], int n) {
        //Complete the function
     
       int left = 0;
       int right = 0;
        for(int i =0; i<arr.length; i++){
           if(i<arr.length/2){
               left+= arr[i];
           }else{
               right +=arr[i];
           }
        }
         return (left*right);

/*
         dry run; 
         
         i=0 1 ; 
         1 <2
         left 1;
         
         i=1 2 ;
         2<3
         left 3;
         i=2 ; 
         3<3
         right 3;
         i = 3;
         3<4
         left 7
         in this case right will be 3 and left will be 7 3*7 = 21;
         */
       


code 2;


         int start =0;
         int end = arr.length;
         int mid = (end-start)/2; // in this case mid matter end-start should be
         int sum1 = 0;
         int sum2=0;
         for(int i =0; i<mid; i++){
             sum1+=arr[i];
         }
         for(int i =mid; i<n; i++){
             sum2+=arr[i];
         }
         return (sum1*sum2);
       
    }
    
    
}



code 3;


int i,sum1=0,sum2=0;
   for(i=0;i<n/2;i++)
     sum1+=arr[i];
     for(i=n/2;i<n;i++)
      sum2+=arr[i];
      return sum1*sum2



code 4; 


int sum1=0,sum2=0;
   for(int i=0;i<n;i++)
   {
       if(i<n/2)
   {sum1=sum1+arr[i];}
       else
      { sum2=sum2+arr[i]; }
   }
   return (sum1*sum2);


