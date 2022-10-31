```java
//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    public static void main(String args[])throws IOException
    {
        //reading input using BufferedReader class
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        //reading total testcases
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            //reading number of elements and weight
            int n = Integer.parseInt(read.readLine());
            int w = Integer.parseInt(read.readLine());
            
            int val[] = new int[n];
            int wt[] = new int[n];
            
            String st[] = read.readLine().trim().split("\\s+");
            
            //inserting the values
            for(int i = 0; i < n; i++)
              val[i] = Integer.parseInt(st[i]);
             
            String s[] = read.readLine().trim().split("\\s+"); 
            
            //inserting the weigths
            for(int i = 0; i < n; i++)
              wt[i] = Integer.parseInt(s[i]);
              
            //calling method knapSack() of class Knapsack
            System.out.println(new Solution().knapSack(w, wt, val, n));
        }
    }
}




// } Driver Code Ends


class Solution 
{ 
    //Function to return max value that can be put in knapsack of capacity W.
    static int[][] dp = new int [1001][1001];
    static int knapSack(int w, int wt[], int val[], int n) 
    { 
        for(int [] rows:dp){
            Arrays.fill(rows,-1);
        }
        return helper(w,wt,val,n);
    } 
    public static int helper(int w, int[] wt,int[] val,int n){
                 if(n ==0 || w==0) return 0;
         if(dp[n][w]!=-1) return dp[n][w];
   
    if(wt[n-1]<=w){
        return dp[n][w]=Math.max(val[n-1]+helper(w-wt[n-1],wt,val,n-1),helper(w,wt,val,n-1));
        //  return dp[n][w];
    }
    else{
        return dp[n][w]=helper(w,wt,val,n-1);
            // return dp[n][w];
}
    }
}
```

```java
class Solution 
{ 
    //Function to return max value that can be put in knapsack of capacity W.
    static int[][] dp = new int [1001][1001];
    static int knapSack(int w, int wt[], int val[], int n) 
    { 
        for(int [] rows:dp){
            Arrays.fill(rows,-1);
        }
        return helper(w,wt,val,n);
    } 
    public static int helper(int w, int[] wt,int[] val,int n){
                 if(n ==0 || w==0) return 0;
         if(dp[n][w]!=-1) return dp[n][w];
   
    if(wt[n-1]<=w){
        return dp[n][w]=Math.max(val[n-1]+helper(w-wt[n-1],wt,val,n-1),helper(w,wt,val,n-1));
        //  return dp[n][w];
    }
    else{
        return dp[n][w]=helper(w,wt,val,n-1);
            // return dp[n][w];
}
    }
      /*
    to esme memorization ka use kia h humne. to esme pehle matrix bana lenge.
    jo size hoga w (capacity )  ka or n(items); ki kitni capactiy hogi bag ki. or kitne items hogi.
    
    esme matrix ka use memorization ke liye kr rahe h kyuki. recursion bar bar kuch chieze same hi kr raha hoga hamare functionme.
    to repeataion se memory and run time dono hi high hote hai.
    to esliye liey matrix use krenge memroization ki.
    - to esme pehle matrix me sab jagah pe -1 store kr denge kyuki question me mention h starting 0 or 1 se hogi.
    - kyuki bag kabhi bhi negative store nahi krta h kuch nahi hoga to 0 hoga. na ki negative me hoga.
    - ager maximum profit hua to thik wrna profit na hua to bhi 0 hi hoga.
    and esme array.fill method se pure me -1 fill kr denge.
    then helper function bnaayenge.
    jo hamara capacity items weight and item value and itesm leke jayega.
    
    fir main kam h base case found krna.
    to esme hoga ye ki. hum minimum case check krenge ki minimum case kya ho skta hai;
    kyuki hum n-1 krte jayenge or base case ko hit karenge.
    to base case ke liye hum check krna hoga ki minimum hamara profit or item or weight capapcity kitni ho skti. 
    
    - to es case me ho skta hai ki hamari capacity 0 ho ki bag ho hi na or usme jagah na ho to uski cpaacity 0 ho skti hai.
    or ek or case ho skta hai ki. items ho hi na jaha buy krne ja rahe waha pe hum bag me bharenge kya ? so that
    item 0 ho skti h item means N.
    to es case me haamra base case hoga ki if items(N) or hamara weight(capacity (W)) ager 0 h to return 0 kr do.
    
    - ab next me memorization ka use karenge ki matrix me dekhenge. ki ager koi value -1 me nahi h means humne pehle us jagah pe ja chuke
    hai or usme value present hai or hum same value pe hi ja rahe h again to simple wahi se hi wo value return kr denge.
    es se hamara again recusive call pura again check nahi krega es se time and space bachega.
    - to ager -1 present h mean waha pe humne visit nahi kia h or value nahi h to.
    ab hum waha pe value dalenge.
    dalne ke liye check karenge. ki jo weight[n-1] hai wo ager w(capacity ) se kam h to. usko chec karenge
    or karenge ye ki hume maximum profit chaahiye.
    so for that hum math.max method se maximum profit find karenge.
    or esme math.max method me hum recusive call karenge.
    pehle hum khud se ek value le lenge val[n-1] ye es liye ki humne hamara kam kr dia humne ek chiez bag me dal di hai.
    baaki recursion ka kam h ki wo kese dalta hai. wo fir helper function
    call kareaga or  weight(capacity) me se weight(n-1) karega kyuki hum pehle ek
    wait ka use kr chuke hai. to hum w - kr denge ek value kyuki ek weight pehle
    se hum bag me dal chuke hai. or second me hum include nahi kr rahe h na w minus hoga
    na hi or kuch hoga.
    
    ab if condition hogi ki or keh skte h ki esle condition hogi ki.
    hamara jo wt[n-1] hai wo >h w(capacity se ) to usko include nahi karenge.
    simple n-1 krke discart kr denge or next remaining value me chec karnege.
    ye wali call bhi memorizatin me store karenge matrix me kyuki next time
    ager ye greater capacity wala hume mile to recusion again same process na kare.
    simple wahi se return kr de.
    
    es tarah se hamara ho jayega dp ka memoriziation.
    
    
    
    
    */
}
```

```text
  /*
    to esme memorization ka use kia h humne. to esme pehle matrix bana lenge.
    jo size hoga w (capacity )  ka or n(items); ki kitni capactiy hogi bag ki. or kitne items hogi.
    
    esme matrix ka use memorization ke liye kr rahe h kyuki. recursion bar bar kuch chieze same hi kr raha hoga hamare functionme.
    to repeataion se memory and run time dono hi high hote hai.
    to esliye liey matrix use krenge memroization ki.
    - to esme pehle matrix me sab jagah pe -1 store kr denge kyuki question me mention h starting 0 or 1 se hogi.
    - kyuki bag kabhi bhi negative store nahi krta h kuch nahi hoga to 0 hoga. na ki negative me hoga.
    - ager maximum profit hua to thik wrna profit na hua to bhi 0 hi hoga.
    and esme array.fill method se pure me -1 fill kr denge.
    then helper function bnaayenge.
    jo hamara capacity items weight and item value and itesm leke jayega.
    
    fir main kam h base case found krna.
    to esme hoga ye ki. hum minimum case check krenge ki minimum case kya ho skta hai;
    kyuki hum n-1 krte jayenge or base case ko hit karenge.
    to base case ke liye hum check krna hoga ki minimum hamara profit or item or weight capapcity kitni ho skti. 
    
    - to es case me ho skta hai ki hamari capacity 0 ho ki bag ho hi na or usme jagah na ho to uski cpaacity 0 ho skti hai.
    or ek or case ho skta hai ki. items ho hi na jaha buy krne ja rahe waha pe hum bag me bharenge kya ? so that
    item 0 ho skti h item means N.
    to es case me haamra base case hoga ki if items(N) or hamara weight(capacity (W)) ager 0 h to return 0 kr do.
    
    - ab next me memorization ka use karenge ki matrix me dekhenge. ki ager koi value -1 me nahi h means humne pehle us jagah pe ja chuke
    hai or usme value present hai or hum same value pe hi ja rahe h again to simple wahi se hi wo value return kr denge.
    es se hamara again recusive call pura again check nahi krega es se time and space bachega.
    - to ager -1 present h mean waha pe humne visit nahi kia h or value nahi h to.
    ab hum waha pe value dalenge.
    dalne ke liye check karenge. ki jo weight[n-1] hai wo ager w(capacity ) se kam h to. usko chec karenge
    or karenge ye ki hume maximum profit chaahiye.
    so for that hum math.max method se maximum profit find karenge.
    or esme math.max method me hum recusive call karenge.
    pehle hum khud se ek value le lenge val[n-1] ye es liye ki humne hamara kam kr dia humne ek chiez bag me dal di hai.
    baaki recursion ka kam h ki wo kese dalta hai. wo fir helper function
    call kareaga or  weight(capacity) me se weight(n-1) karega kyuki hum pehle ek
    wait ka use kr chuke hai. to hum w - kr denge ek value kyuki ek weight pehle
    se hum bag me dal chuke hai. or second me hum include nahi kr rahe h na w minus hoga
    na hi or kuch hoga.
    
    ab if condition hogi ki or keh skte h ki esle condition hogi ki.
    hamara jo wt[n-1] hai wo >h w(capacity se ) to usko include nahi karenge.
    simple n-1 krke discart kr denge or next remaining value me chec karnege.
    ye wali call bhi memorizatin me store karenge matrix me kyuki next time
    ager ye greater capacity wala hume mile to recusion again same process na kare.
    simple wahi se return kr de.
    
    es tarah se hamara ho jayega dp ka memoriziation.
    
    
    
    
    */
```




You are given weights and values of N items, put these items in a knapsack of capacity W to get the maximum total value in the knapsack. Note that we have only one quantity of each item.
In other words, given two integer arrays val[0..N-1] and wt[0..N-1] which represent values and weights associated with N items respectively. Also given an integer W which represents knapsack capacity, find out the maximum value subset of val[] such that sum of the weights of this subset is smaller than or equal to W. You cannot break an item, either pick the complete item or dont pick it (0-1 property).

Example 1:

Input:
N = 3
W = 4
values[] = {1,2,3}
weight[] = {4,5,1}
Output: 3
Example 2:

Input:
N = 3
W = 3
values[] = {1,2,3}
weight[] = {4,5,6}
Output: 0
Your Task:
Complete the function knapSack() which takes maximum capacity W, weight array wt[], value array val[], and the number of items n as a parameter and returns the maximum possible value you can get.

Expected Time Complexity: O(N*W).
Expected Auxiliary Space: O(N*W)

Constraints:
1 ≤ N ≤ 1000
1 ≤ W ≤ 1000
1 ≤ wt[i] ≤ 1000
1 ≤ v[i] ≤ 1000