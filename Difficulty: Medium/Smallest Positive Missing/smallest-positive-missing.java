class Solution {
    public int missingNumber(int[] arr) {
        // code here
        int n = arr.length;
        Set<Integer> set = new HashSet<>();
        for(int num: arr){
            set.add(num);
        }
        for(int i=1; i<=n+1; i++){
            if(!set.contains(i)) return i;
        }
        return -1;
    }
}
