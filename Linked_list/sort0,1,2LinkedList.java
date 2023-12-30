//User function Template for Java

/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        ArrayList<Integer> list=new ArrayList<>(); //Step-1
      Node curr=head;
      while(curr!=null)  //Step-2
      {
          list.add(curr.data);
          curr=curr.next;
      }

      Collections.sort(list); //Step-3

      int i=0;
      int l=list.size();
      Node o=new Node(-1);  //Step-4
      curr=o;
      while(l-->0)
      {
          Node n=new Node(list.get(i++));
          o.next=n;
          o=n;
      }
      return curr.next;
    }
}
