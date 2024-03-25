
/*
Structure of node class is:
class Node {
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
*/
class Solution {
    
  public Node insertInMid(Node head, int data){
      Node curr=head;
      int l=0;
      while(curr!=null)
      {
          curr=curr.next;
          l++;
      } curr=head;
      Node n=new Node(data);
      if(l%2==0)
      {
          for(int i=0;i<=l/2-2;i++)
          {
              curr=curr.next;
          }
          n.next=curr.next;
          curr.next=n;
      }
      else if(l%2!=0)
      {
          for(int i=0;i<l/2;i++)
          {
              curr=curr.next;
          }
          n.next=curr.next;
          curr.next=n;
      }
      
      return head;
  }
}