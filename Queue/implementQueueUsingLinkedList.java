public class implementQueueUsingLinkedList {
  /*The structure of the node of the queue is
class QueueNode
{
	int data;
	QueueNode next;
	QueueNode(int a)
	{
	    data = a;
	    next = null;
	}
}*/

class MyQueue
{
    QueueNode front, rear;
    
    //Function to push an element into the queue.
	void push(int a)
	{
        QueueNode node=new QueueNode(a);
        if(front==null){
        rear=front=node;
        return;}
        rear.next=node;
        rear=rear.next;
	}
	
    //Function to pop front element from the queue.
	int pop()
	{
	    if(front==null)
        return -1;
	    int x=front.data;
	    front=front.next;
	    return x;
	}
}

}
