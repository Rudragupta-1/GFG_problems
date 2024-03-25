
/* Structure of node

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
*/

class Solution
{
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
    	Node curr=head;int l=0;
    	while(curr!=null)
    	
    	{
    	    curr=curr.next;
    	    l++;
    	}
    	if(n>l) return -1;
    	curr=head;
    	for(int i=1;i<=l-n;i++)
    	{
    	    curr=curr.next;
    	}
    	return curr.data;
    }
}