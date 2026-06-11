class Solution {
    static int sumOfDigits(int n) {
        //recursion☠️
        if(n == 0) return 0;
        return n%10 + sumOfDigits(n/10);
    }
}
