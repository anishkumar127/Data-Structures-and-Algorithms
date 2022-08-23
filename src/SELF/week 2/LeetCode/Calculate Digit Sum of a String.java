
// 10ms
class Solution {
    public String digitSum(String s, int k) {
        
    while(k<s.length()){
        s= roundTrip(s,k);
    }
        return s;

    }
    private String roundTrip(String s, int k){
        // two pointer.
        int i=0;
        int j=0;
        int sum=0;
        String rounded="";
        while(i<s.length()){
            while(j<k && i<s.length()){
                sum+= (s.charAt(i)-'0'); // converting to digit.
                i++;
                j++;
            }
            rounded=rounded+sum;
            j=0;     // again initialize to 0;
            sum=0;  // initialize to 0;
        }
        return rounded;
    }
}



// recursion

//This Solution Can Be Improved By Memoization Technique
class Solution {
    public String digitSum(String s, int k) {
        int sum = 0;
        String str = "";
        //Check If The Summed Up String's Length Is Less Than K 
        while(s.length()>k){
            //Recursive Function To Find The Summed Up String
            s = calculateRecurse(s, k);
        }
        return s;
    }
        
    public String calculateRecurse(String str, int k){
        int sum = 0;
        //Check If The String's Length Is Less/Equal To K
        //Stopping Condition For A Recursive Function
        if(str.length() <= k){
            for(int i=0; i<str.length(); i++){
                //Easiest Way To Convert A Char Value To Integer
                sum += str.charAt(i) - 48;
            }
            //Easiest Way To Convert A Integer To Char
            return sum + "";
        }
        //Recursive Flow Condition
        String s = str.substring(0,k);
        for(int i=0; i<k; i++){
            sum += str.charAt(i) - 48;
        }
        return (sum + "") + calculateRecurse(str.substring(k,str.length()), k);
    }
}




    // fasted and unique way j loop.

    class Solution {
    public String digitSum(String s, int k) 
    {
        while(s.length()>k)
        {
            StringBuilder u=new StringBuilder();
            for(int i=0;i<s.length();i+=k)
            {
                int n=0;
                for(int j=i;j<i+k && j<s.length(); j++)
                    n+=s.charAt(j)-'0';
                u.append(n);
            }
            s=u.toString();
        }
        return s;
    }
}


// string builder.

public String digitSum(String s, int k) {
        while (s.length() > k) {
            s = replaceWithSum(s, k);
        }
        return s;
    }

    private String replaceWithSum(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int currentSum = 0;

        for (int i = 0; i < s.length(); i++) {
            currentSum += s.charAt(i) - '0';
            if ((i + 1) % k == 0 || i == s.length() - 1) {
                sb.append(currentSum);
                currentSum = 0;
            }
        }
        return sb.toString();
    }
