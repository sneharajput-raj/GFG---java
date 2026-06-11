class Solution {
    void segregate0and1(int[] arr) {
        int n = arr.length;
        int[] copy = new int[n];
        int j = n-1;
        for(int i=0; i<n; i++){
            if(arr[i] == 1){
                copy[j] = arr[i]; 
                j--;
            }
        }
        for(int i=0; i<n; i++){
            arr[i] = copy[i];
        }
    }
}
