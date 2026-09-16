class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
        // code here
        int n = arr.length;
        Map<Integer, Integer> map = new TreeMap<>();
        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        
        ArrayList<Integer> li= new ArrayList<>();
        for(int key : map.keySet()){
            if(map.get(key) > n/3){
                li.add(key);
            }
        }
        return li;
    }
}