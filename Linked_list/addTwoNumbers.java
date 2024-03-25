/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution{
  //Function to add two numbers represented by linked list.
  static Node reverseList(Node head)
  {
      Node prev=null;
      Node curr=head;
      Node next;
      while(curr!=null)
      {
          next=curr.next;
          curr.next=prev;
          prev=curr;
          curr=next;
      }
      return prev;
  }
  static Node addTwoLists(Node first, Node second){
      // code here
      // return head of sum list
      int carry=0;
      int sum=0;
      Node l1=reverseList(first);
      Node l2=reverseList(second);
      Node t1=l1;
      Node t2=l2;
      Node o=new Node(0);
      Node r1=o;
      while(t1!=null && t2!=null)
      {
          Node n=new Node((t1.data+t2.data+carry)%10);
          o.next=n;
          o=n;
          carry=(t1.data+t2.data+carry)/10;
          t1=t1.next;
          t2=t2.next;
      }
      while(t1!=null)
      {
          Node n1=new Node((t1.data+carry)%10);
          o.next=n1;
          o=n1;
          carry=(t1.data+carry)/10;
          t1=t1.next;
      }
      while(t2!=null)
      {
          Node n1=new Node((t2.data+carry)%10);
          o.next=n1;
          o=n1;
          carry=(t2.data+carry)/10;
          t2=t2.next;
      }
      if(carry!=0)
      {
          Node c=new Node(carry);
          o.next=c;
          o=c;
      }
      return reverseList(r1.next);
  }
}