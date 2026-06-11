class Solution {
    public int getSecondLargest(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int max = arr[n-1];
        int smax = -1;
        for(int i=n-1; i>=0; i--){
            if(arr[i] != max){
                smax = arr[i];
                break;
            }
        }
        return smax;
    }
}