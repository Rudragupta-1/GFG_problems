
/* Structure of class Node is
class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/


class Solution {
  boolean isPalindrome(Node head) {
     Node slow=head;
     Node fast=head;
     while(fast!=null && fast.next!=null)
      {
          slow=slow.next;
          fast=fast.next.next;
     }
     Node prev=null;
     Node next;
     while(slow!=null)
     {
         next=slow.next;
         slow.next=prev;
         prev=slow;
         slow=next;
     }
     Node rh=prev;
     Node lh=head;
     while(rh!=null && lh!=null)
     {
         if(rh.data==lh.data)
         {
             lh=lh.next;
             rh=rh.next;
         }
         else{
             return false;
         }
     }
     return true;
 }
}