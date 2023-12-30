/* The structure of linked list is the following
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d; 
        next = null;
    }
}
*/

class Solution
{
    //Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) 
    {
        ArrayList<Integer> list=new ArrayList<>(); //Step-1
      Node curr=head;
        HashSet<Integer> set=new HashSet<>();
        ArrayList<Integer> list2=new ArrayList<>();
     
      while(curr!=null)
      {
          if(!set.contains(curr.data))
          {
              list2.add(curr.data);
              set.add(curr.data);
          }
          curr=curr.next;
      }

      int i=0;
      int l=list2.size();
      Node o=new Node(-1);  //Step-4
      curr=o;
      while(l-->0)
      {
          Node n=new Node(list2.get(i++));
          o.next=n;
          o=n;
      }
      return curr.next;
    }
}
