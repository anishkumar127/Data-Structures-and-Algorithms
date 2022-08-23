/*
in which we simple iterating and where find modular % 3 5  where we instead of printing index. just 
print the string fizz buzz  rest of just printing the indexes. 
 */
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        
        for(int i=1, fizz=0, buzz=0; i<=n; i++){ /// mentioned 1-indexed. wo <=n
            fizz++;
            buzz++;
            if(fizz==3 & buzz==5){
                fizz=0;
                buzz=0;
                list.add("FizzBuzz");
            }else if(fizz==3){
                fizz=0;
                list.add("Fizz");
            }else if(buzz==5){
                buzz = 0;
                list.add("Buzz");
            }else{
                list.add(Integer.toString(i));
            }
            
        }
        return list;
    }
}


//

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>();
        for (int i= 1; i <= n; i++) {
            String current = "";
            if (i % 3 == 0) {
                current = "Fizz";
            }
            if (i % 5 == 0) {
                current += "Buzz";
            }
            if (current.length() == 0) {
                current = String.valueOf(i);
            }
            answer.add(current);
        }
        return answer;
    }
}

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();
        int i = 1;
        for (i = 1; i < n + 1; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                ans.add("FizzBuzz");
            } else if (i % 3 == 0) {
                ans.add("Fizz");
            } else if (i % 5 == 0) {
                ans.add("Buzz");
            } else
                ans.add(Integer.toString(i));
        }
        return ans;
    }
}


Using % operator Approach

class Solution {
    public List<String> fizzBuzz(int n) {
         List<String> result = new ArrayList<>();
         for (int i = 1;i<=n;i++){
             if (i % 3 == 0 && i % 5 == 0) result.add("FizzBuzz");
             else if (i % 5  == 0) result.add("Buzz");
             else if (i % 3  == 0) result.add("Fizz");
             else result.add(""+i);
         }
         return result;
    }
}
Using HashMap

class Solution {
    public List<String> fizzBuzz(int n) {
	     List<String> result = new ArrayList<>();
         Map<Integer, String> map = new HashMap<>();
         map.put(3,"Fizz");
         map.put(5,"Buzz");        
         for (int i = 1;i<=n;i++){
             String ansString = "";
             for (Integer key : map.keySet())
                 if (i % key == 0) ansString += map.get(key);
             if (ansString.equals("")) ansString += i;
             result.add(ansString);
         }
         return result;
	}
}
Without using %

 class Solution {
    public List<String> fizzBuzz(int n) {       
        List<String> result = new ArrayList<>();
        if (n < 1) return result;
        
        int fizz = 3;
        int buzz = 5;
        
        for (int i=1;i<=n;i++){
            String ansString = "";
            if (i == fizz && i == buzz){
                ansString = "FizzBuzz";
                fizz+=3;
                buzz+=5;
            } 
            else if(i == fizz){
                ansString = "Fizz";
                fizz+=3;
            }
            else if(i == buzz){
                ansString = "Buzz";
                buzz+=5;
            }
            else ansString = ""+i;
            result.add(ansString);
        }
        return result;
    }
}







