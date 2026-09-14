class Solution {
    public ArrayList<ArrayList<Integer>> countFreq(int[] arr) {
        // code here
        ArrayList<ArrayList<Integer>> li = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        for(int key : map.keySet()){
            ArrayList<Integer> l = new ArrayList<>();
            l.add(key);
            l.add(map.get(key));
            
            li.add(l);
        }
        return li;
    }
}