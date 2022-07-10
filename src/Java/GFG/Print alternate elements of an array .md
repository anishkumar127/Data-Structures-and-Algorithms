<!-- https://practice.geeksforgeeks.org/problems/print-alternate-elements-of-an-array/1/?page=2&difficulty[]=-2&difficulty[]=-1&difficulty[]=0&category[]=Arrays&sortBy=submissions -->

```
class GfG
{
    public static void print(int arr[], int n)
    {
        // your code here
        for(int i=0; i<n; i++){
            if(i%2==0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}

```
```
for(int i=0;i<n;i=i+2)System.out.print(arr[i]+" ");


  for (int i=0;i<n;i++)
       {
           System.out.print(arr[i]+" ");
           i=i+1;
       }
    ```   