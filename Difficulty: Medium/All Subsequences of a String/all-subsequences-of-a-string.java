class Solution {
    public void subseq(String s, String curr, int i, List<String> list){
        //base case
        if(i == s.length()){
            list.add(curr);    // ek subsequence mil gya
            return;
        }
        char ch = s.charAt(i);
        //pick
        subseq(s, curr+ch, i+1, list);
        //skip
        subseq(s, curr, i+1, list);
    }
    public List<String> powerSet(String s) {
       List<String> list = new ArrayList<>();
       subseq(s, "", 0, list);
       Collections.sort(list);
       return list;
    }
}