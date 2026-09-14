
class Solution {
    public boolean isSubset(int a[], int b[]) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num1 : a){
            map.put(num1, map.getOrDefault(num1, 0)+1);
        }
        for(int num2 : b){
            if(!map.containsKey(num2) || map.get(num2) == 0){
                return false;
            }
            map.put(num2, map.get(num2)-1);  //agr hai toh map se value(count) km krte jayenge
        }
        return true;
    }
}
