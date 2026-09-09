/* Structure of doubly linked list Node
class Node {
  public int data;
  public Node next;
  public Node prev;

  public Node(int x) {
      data = x;
      next = null;
      prev = null;
  }
};*/
class Solution {
    public List<List<Integer>> displayList(Node head) {
       List<List<Integer>> ans = new ArrayList<>();
       if(head == null) return ans;
       
       List<Integer> forward = new ArrayList<>();
       Node temp = head;
       while(temp != null){
           forward.add(temp.data);
           temp = temp.next;
       }
       
       List<Integer> backward = new ArrayList<>(forward);
       Collections.reverse(forward);
       
       ans.add(backward);
       ans.add(forward);
       
       return ans;
    }
}