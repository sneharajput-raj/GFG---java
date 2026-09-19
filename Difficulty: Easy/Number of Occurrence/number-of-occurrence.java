class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int count = 0;
        for(int ele : arr){
            if(ele == target){
                count++;
            }
        }
        return count;
    }
}
