// TC - O(n)
// SC - O(n)

class Solution{
    static long factorial(int N){
        if(N==0) return 1;
        else {
            return N * factorial(N-1);
        }
    }
}