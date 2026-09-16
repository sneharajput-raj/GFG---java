class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        Set<Integer> set = new LinkedHashSet<>();
        for(int ele : arr){
            set.add(ele);
        }
        return new ArrayList(set);
    }
}
