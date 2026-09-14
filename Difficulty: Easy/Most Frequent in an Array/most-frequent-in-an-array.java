class Solution {
    public int mostFreqEle(int[] arr) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        int maxFreq = 0;
        int ans = Integer.MIN_VALUE;
        for(int key : map.keySet()){
            int element = key;
            int freq = map.get(key);
            
            if(freq > maxFreq){
                maxFreq = freq;
                ans = element;
            }
            else if(freq == maxFreq){
                ans = Math.max(ans, element);
            }
        }
        return ans;
    }
}