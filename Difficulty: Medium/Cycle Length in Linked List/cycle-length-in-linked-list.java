/* Structure of Linked List Node
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}*/

class Solution {
    public int countNodes(Node slow){
        int count = 1;
        Node temp = slow.next;
        
        while(temp != slow){
            count++;
            temp = temp.next;
        }
        return count;
    }
    public int lengthOfLoop(Node head) {
        if(head == null || head.next == null) return 0;
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){    //cycle found
                return countNodes(slow);
            }
        }
        return 0;    //No cycle found
    }
}