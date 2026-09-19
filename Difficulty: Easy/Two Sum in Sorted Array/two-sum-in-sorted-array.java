class Solution {
    public ArrayList<Integer> twoSum(int[] arr, int target) {
        // code here
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int firstI = -1;
        int lastI = -1;
        ArrayList<Integer> li = new ArrayList<>();
        while(low < high){
            if((arr[low] + arr[high]) == target){
                li.add(low+1);
                li.add(high+1);
                return li;
            }
            else if((arr[low] + arr[high]) > target){
                high--;
            }
            else{
                low++;
            }
        }
        li.add(-1);
        li.add(-1);
        return li;
    }
}