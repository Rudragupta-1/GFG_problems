/*
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution
{
    //Function to insert a node at the beginning of the linked list.
    Node insertAtBeginning(Node head, int x)
    {
        Node temp=new Node(x);
        temp.next=head;
        head=temp;
        return head;
    }
    
    //Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x)
    {
        Node temp=new Node(x);
        Node curr=head;
        if(head==null) return temp;
        while(curr.next!=null)
        {
            curr=curr.next;
        }
        curr.next=temp;
        temp.next=null;
        return head;
    }
}