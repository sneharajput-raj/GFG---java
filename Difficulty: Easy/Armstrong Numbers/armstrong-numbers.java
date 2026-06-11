// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        int sum = 0;
        int dummy = n;
        while(n != 0){
            int rem = n%10;
            sum += rem*rem*rem;
            n = n/10;
        }
        if(dummy == sum) return true;
        return false;
    }
}