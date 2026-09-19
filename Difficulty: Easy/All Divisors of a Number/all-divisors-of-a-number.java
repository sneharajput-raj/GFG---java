class Solution {
    public ArrayList<Integer> getDivisors(int n) {
        // code here
        ArrayList<Integer> li = new ArrayList<>();
        for(int i=1; i*i<=n; i++){
            if(n % i == 0){
                li.add(i);
            }
        }
        for(int i=(int)Math.sqrt(n); i>=1; i--){
            if(n % i == 0){
                if(i != n/i){
                    li.add(n / i);
                }
            }
        }
        return li;
    }
}