/*
Input:
N = 5
names[] = { "Geek", "Geeks", "Geeksfor","GeeksforGeek", "GeeksforGeeks" };
Output:
GeeksforGeeks
*/
// return also min and check it. 

class GFG {
    String longest(String names[], int n) {
      String max = names[0];
      for(int i=1; i<names.length; i++){
          if(names[i].length()>max.length()){
              max= names[i];
          }
      }
      return max;
    }
}