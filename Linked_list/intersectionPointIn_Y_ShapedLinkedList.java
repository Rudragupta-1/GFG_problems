/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
 Linked List class
class LinkedList
{
    Node head;  // head of list
}*/

class Intersect
{
    //Function to find intersection point in Y shaped Linked Lists.
	int intersectPoint(Node head1, Node head2)
	{
        int l1=0;
        int l2=0;
        Node curr=head1;
        Node curr2=head2;
        while(curr!=null)
        {
            l1++;
            curr=curr.next;
        }
        
        while(curr2!=null)
        {
            l2++;
            curr2=curr2.next;
        } int move=0;
        if(l1>l2)
        {
            move=l1-l2;
        }
        else move=l2-l1;
        curr=head1;
        curr2=head2;
        while(l1>l2 && move-->0 && curr!=null)
        {
            curr=curr.next;
        }
        while( l2>=l1 && move-->0 && curr2!=null)
        {
            curr2=curr2.next;
        }
        while(curr.next!=null && curr2.next!=null)
        {
            if(curr.next==curr2.next && curr!=curr2)
            return curr.next.data;
            else{ curr=curr.next;curr2=curr2.next;}
        }
        return -1;
	}
}
