import java.util.*;

public class Main {
  static int ans;
    public static void main(String[] args) {
      ans = -1;
     Scanner sc = new Scanner(System.in);
     int x = sc.nextInt();
     squareRoot(x,1,x);
     System.out.print(ans);
  }
private static void squareRoot(int x, long start, long end){
  
  if(start>end){
    return;
  }
  long mid = (start+end)/2;
  
  if(mid*mid<=(long)x){
    ans =(int) mid;
    squareRoot(x,mid+1,end);
  }else{
    squareRoot(x,start,mid-1);
  }
}
}