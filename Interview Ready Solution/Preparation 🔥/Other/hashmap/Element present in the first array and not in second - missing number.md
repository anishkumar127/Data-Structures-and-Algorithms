```java
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
    
        int N = sc.nextInt();
        int M = sc.nextInt();

        int A[]=new int[N];
        int B[]=new int[M];

        for(int i=0;i<N;i++)
        A[i]=sc.nextInt();

        for(int i=0;i<M;i++)
        B[i]=sc.nextInt();
        
        Accio ob = new Accio();
        ArrayList<Integer> ans= ob.missingElement(A,N,B,M);
        
        for(int x:ans)
        System.out.print(x+" ");

        System.out.println();
    
    }
}


class Accio {
    ArrayList<Integer> missingElement(int A[], int n,int B[],int m)
    {
       ArrayList<Integer> list = new ArrayList<>();
            for(int i =0; i<n; i++){
                    int count =0;
                    for(int j=0; j<m; j++){
                            if(A[i]==B[j]){
                                    count++;
                                    break;
                            }
                    }
                    if(count==0){
                            list.add(A[i]);
                    }
            }
            return list;
    }
}

```

