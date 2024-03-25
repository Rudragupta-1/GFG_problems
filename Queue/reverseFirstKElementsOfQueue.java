class GfG {
  // Function to reverse first k elements of a queue.
  public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
      Deque<Integer> d1=new LinkedList<>();
      while(k-->0)
      {
          d1.push(q.remove());
      }
      int x=q.size();
      while(x-->0)
      {
          d1.add(q.remove());
      }
      while(!d1.isEmpty())
      {
          q.add(d1.remove());
      }
      return q;
  }
}
