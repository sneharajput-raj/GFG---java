class Solution {
    public int calArea(int[][] arr) {
        // code here
        int m = arr.length;
        int n = arr[0].length;
        int maxArea = Integer.MIN_VALUE;
        for(int i=0; i<m; i++){
            int currArea = 1;
            for(int j=0; j<n; j++){
                currArea = currArea * arr[i][j];
                maxArea = Math.max(maxArea, currArea);
            }
        }
        return maxArea;
    }
}