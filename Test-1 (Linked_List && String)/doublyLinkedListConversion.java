
class GfgNew{
  // Function to convert singly linked list to doubly
     static void makeDoubly(Node head){
        Node temp=head;
         Node curr=head.next;
         while(curr!=null)
         {
             curr.prev=temp;
             temp=temp.next;
             curr=curr.next;
         }
     }
 }