import java.util.Queue;

public class operationsOnQueue {
  class Solution {
    
    //Function to push an element in queue.
    void enqueue(Queue<Integer> q, int x){
        q.add(x);
    }
    
    //Function to remove front element from queue.
    void dequeue(Queue<Integer> q){
        q.remove();
    }
    
    //Function to find the front element of queue.
    int front(Queue<Integer> q){
        return q.peek();
    }
    
    //Function to find an element in the queue.
    String find(Queue<Integer> q, int x){
        return q.contains(x)==true?"Yes":"No";
    }
}
}
