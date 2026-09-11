/* Linked List Node Structure
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
*/
class Solution {
    public static int getLength(Node head) {
        // code here
        if(head == null){
            return 0;
        }
        int count = 1;
        Node temp = head.next;
        while(temp != head){
            count++;
            temp = temp.next;
        }
        return count;
    }
}