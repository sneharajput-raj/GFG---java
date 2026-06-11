class Solution {
    public static ArrayList<Integer> valEqualToPos(int[] arr) {
        ArrayList<Integer> li = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(i+1 == arr[i]) li.add(arr[i]);
        }
        return li;
    }
}
