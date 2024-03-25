//Function to rotate deque by k places in anti-clockwise direction.
public static void left_Rotate_Deq_ByK(ArrayDeque<Integer> deque, int n, int k)
{
    Deque<Integer> d = new ArrayDeque<>();
    int i=0;
    while(i++<k)
    {
        d.offerFirst(deque.pollFirst());
    }
    i=0;
    while(i++!=n-k){
        d.offerLast(deque.pollLast());
    }
    while(!d.isEmpty())
    {
        deque.offerFirst(d.pollFirst());
    }
}

//Function to rotate deque by k places in clockwise direction.
public static void right_Rotate_Deq_ByK(ArrayDeque<Integer> deque, int n, int k)
{
    Deque<Integer> d = new ArrayDeque<>();
    int i=0;
    while(i++!=n-k){
        d.offerFirst(deque.pollFirst());
    }
    i=0;
    while(i++<k)
    {
        d.offerLast(deque.pollLast());
    }
    while(!d.isEmpty())
    {
        deque.offerFirst(d.pollFirst());
    }
}