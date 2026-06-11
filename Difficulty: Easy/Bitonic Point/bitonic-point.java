// User function Template for Java

class Solution {
    public int findMaximum(int[] arr) {
        int n = arr.length;
        int max = 0;
        for(int i=0; i<n; i++){
            if(arr[i] > max){
                max = Math.max(max, arr[i]);
            }
        }
        return max;
    }
}