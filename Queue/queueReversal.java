//User function Template for Java
/*Complete the function below*/
class GfG{
  //Function to reverse the queue.
  public Queue<Integer> rev(Queue<Integer> q){
      Deque<Integer> d1=new LinkedList<>();
      while(!q.isEmpty())
      {
          d1.push(q.poll());
      }
      while(!d1.isEmpty())
      {
          q.offer(d1.pop());
      }
      return q;
  }
}