/*class Node { 
  
        int data; 
        Node next; 
  
        Node(int d) { 
            data = d; 
            next = null; 
        } 
    } */
    class Swap
    {
        //Function to swap elements pairwise.
        public static Node pairwise_swap(Node head)
        {
          Node curr=head;
          while(curr!=null && curr.next!=null)
          {
              int temp=curr.data;
              curr.data=curr.next.data;
              curr.next.data=temp;
              curr=curr.next.next;
          }       
          return head;
        }
           
    }