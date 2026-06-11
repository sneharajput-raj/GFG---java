class Solution {
    public void segregateElements(int[] arr) {
        int n = arr.length;
        int[] copy = new int[n];
        int j=0;
        for(int i=0; i<n; i++){
            if(arr[i] >= 0){
                copy[j] = arr[i];
                j++;
            }
        }
        for(int i=0; i<n; i++){
            if(arr[i] < 0){
                copy[j] = arr[i];
                j++;
            }
        }
        for(int i=0; i<n; i++){
            arr[i] = copy[i];
        }
    }
}