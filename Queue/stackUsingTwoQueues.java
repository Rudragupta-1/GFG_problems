class Queues
{
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    
    //Function to push an element into stack using two queues.
    void push(int a)
    {
	    if(!q1.isEmpty())
	    q1.add(a);
	    else q2.add(a);
    }
    
    //Function to pop an element from stack using two queues. 
    int pop()
    {
        int res=0;
	    if(q1.isEmpty() && q2.isEmpty())
	    return -1;
	    if(!q1.isEmpty())
	    {
	        while(q1.size()!=1)
	        {
	            int x=q1.remove();
	            q2.add(x);
	        }
	        res=q1.remove();
	    }
	    else{
	        while(q2.size()!=1)
	        {
	            int x=q2.remove();
	            q1.add(x);
	        }
	        res=q2.remove();
	    }
	    return res;
    }
	
}