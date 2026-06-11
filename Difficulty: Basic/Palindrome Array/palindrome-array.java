class Solution {
    public static boolean isPalindrome(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while(low < high){
            if(arr[low] != arr[high]) return false;
            low++;
            high--;
        }
        return true;
    }
}
