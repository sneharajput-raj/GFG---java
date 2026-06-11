// User function Template for Java

class Solution {
    public int reverseDigits(int n) {
        int rev = 0;
        return reverse(rev , n);
    }
    public int reverse(int rev , int n){
        if(n == 0) return rev;
        return reverse(rev*10 + n%10, n/10);
    }
}