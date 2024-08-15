
// TC - O(n)
// SC - O(1)

class Solution{
    static long factorial(int N){
        // code here
        long fact = 1;
        
        for(int i=1;i<=N;i++){
            fact *= i;
        }
        
        return fact;
    }
}