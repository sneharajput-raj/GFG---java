
class Solution {
    public static ArrayList<String> fizzBuzz(int n) {
        // code here
        ArrayList<String> li = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(i % 3 == 0 && i % 5 == 0){
                li.add("FizzBuzz");
            }
            else if(i % 3 == 0){
                li.add("Fizz");
            }
            else if(i % 5 == 0){
                li.add("Buzz");
            }
            else{
                li.add(String.valueOf(i));
            }
        }
        return li;
    }
}
