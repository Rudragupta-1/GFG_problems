public static void eraseAt(ArrayDeque<Integer> deq , int X)
{
    int n=deq.size();
    for(int i=0;i<n;i++)
    {
        if(i==X)
        {
            deq.pollFirst();
        }
        else{
            deq.offerLast(deq.pollFirst());
        }
    }
}

//Function to erase the elements in range start (inclusive), end (exclusive).
public static void eraseInRange(ArrayDeque<Integer> deq , int start, int end)
{
    int n=deq.size();
    for(int i=0;i<n;i++)
    {
        if(i>=start && i<end)
        {
            deq.pollFirst();
        }
        else{
            deq.offerLast(deq.pollFirst());
        }
    }
}

//Function to erase all the elements in the deque.
public static void eraseAll(ArrayDeque<Integer> deq )
{
    deq.clear();
}