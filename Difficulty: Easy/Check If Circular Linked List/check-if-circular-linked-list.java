/*
class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}
*/
class Solution {
    boolean isCircular(Node head) {
        if(head == null){
            return true;
        }
        Node temp = head;
        temp = temp.next;
        while(temp != head && temp != null){
            temp = temp.next;
        }
        return temp == head;
    }
}