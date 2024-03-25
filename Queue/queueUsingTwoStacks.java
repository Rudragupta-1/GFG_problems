class StackQueue
{
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    //Function to push an element in queue by using 2 stacks.
    void Push(int x)
    {
	   s1.push(x);
    }
	
    
    //Function to pop an element from queue by using 2 stacks.
    int Pop()
    {
	   if(s1.isEmpty() && s2.isEmpty())
	   return -1;
	   int res=0;
	   if(!s1.isEmpty())
	   {
	       while(s1.size()!=1)
	       {
	           int c=s1.pop();
	           s2.push(c);
	       }
	       res=s1.pop();
	       while(!s2.isEmpty())
	       {
	           int f=s2.pop();
	           s1.push(f);
	       }
	   }
	   else{
	       while(s2.size()!=1)
	       {
	           int c=s2.pop();
	           s1.push(c);
	       }
	       res=s2.pop();
	       while(!s1.isEmpty())
	       {
	           int f=s1.pop();
	           s2.push(f);
	       }
	   }
	   return res;
    }
}