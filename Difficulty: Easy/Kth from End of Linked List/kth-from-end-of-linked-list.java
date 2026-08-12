/* Structure of Linked List Node
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public int count(Node head){
        int c = 0;
        while(head != null){
            c++;
            head = head.next;
        }
        return c;
    }
    public int getKthFromLast(Node head, int k) {
        int n = count(head);
        if(k > n) return -1;
        int[] arr = new int[n];
        int i=0;
        Node temp = head;
        while(temp != null){
            arr[i] = temp.data;
            i++;
            temp = temp.next;
        }
        return arr[n-k];
    }
}