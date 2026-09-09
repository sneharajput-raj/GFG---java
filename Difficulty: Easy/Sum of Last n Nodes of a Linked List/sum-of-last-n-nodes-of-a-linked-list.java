/* Structure for link list Node
class Node {
  public:
    int data;
    public Node next;
    public Node(int val) {
        data = val;
        next = null;
    }
}; */

class Solution {
    public int sumofNodes(Node head, int n) {
        Node temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        int[] arr = new int[count];
        temp = head;
        for(int i=0; i<count; i++){
            arr[i] = temp.data;
            temp = temp.next;
        }
        if(n >= count){
            n = count;
        }
        int sum = 0;
        for(int i=count-1; i>=count-n; i--){
            sum = sum + arr[i];
        }
        return sum;
    }
};