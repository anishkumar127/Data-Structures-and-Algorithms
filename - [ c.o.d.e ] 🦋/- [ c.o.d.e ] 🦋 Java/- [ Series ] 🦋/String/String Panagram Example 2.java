import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
// for (int  in = t-1; in>=0; in--){

// for (int T = arr.length() - 1; T >= 0; T--) { 
// } 
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		// while(t-- > 0){
		
		
for (int  in = t-1; in>=0; in--){
		String str = sc.next();
		str = str.toLowerCase();
		boolean isPresent[] = new boolean[26];
		
		for(int i =0; i<str.length(); i++){
		  isPresent[(int)str.charAt(i)-97]=true;
		}
		  int result = 1;
		  for(int j =0; j<26; j++){
		    if(isPresent[j]==false){
		      result =0;
		   
		  }
		}
		  System.out.println(result);
		}
	}
}