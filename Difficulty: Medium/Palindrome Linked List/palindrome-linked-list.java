/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    public boolean isPalindrome(Node head) {
        // code here
        Node temp = head;
        int len = 0;
        while(temp != null){
            len++;
            temp = temp.next;
        }
        int[] arr = new int[len];
        temp = head;
        for(int i=0; i<len; i++){
            arr[i] = temp.data;
            temp = temp.next;
        }
        int low = 0,  high = len-1;
        while(low <= high){
            if(arr[low] != arr[high]){
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
}