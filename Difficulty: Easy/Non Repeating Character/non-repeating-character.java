class Solution {
    public char nonRepeatingChar(String s) {
        // code here
        Map<Character, Integer> map = new LinkedHashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        for(char key : map.keySet()){
            if(map.get(key) == 1){
                return key;
            }
        }
        return '$';
    }
}
