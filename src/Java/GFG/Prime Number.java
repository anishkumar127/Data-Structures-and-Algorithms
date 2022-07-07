https://practice.geeksforgeeks.org/problems/prime-number2314/0/?category%5B%5D=Mathematical&category%5B%5D=Mathematical&difficulty%5B%5D=-2&difficulty%5B%5D=-1&difficulty%5B%5D=0&page=1&query=category%5B%5DMathematicaldifficulty%5B%5D-2difficulty%5B%5D-1difficulty%5B%5D0page1category%5B%5DMathematical#

class Solution{
    static int isPrime(int N){
        // code here
    if(N==1 || N==0){
        return 0;
    }
    if(N==2){
        return 1;
    }
    for(int i=2; i*i<=N; i++){
        if(N%i==0){
            return 0;
        }
    } 
    
    return  1;
    }
}