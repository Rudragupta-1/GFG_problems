class Geeks
{
    //Function to push an element into the stack.
    public static void insert(Stack<Integer> st, int x)
    {
        st.push(x);
    }
    
    //Function to remove top element from stack.
    public static void remove(Stack<Integer> st)
    {
        st.pop();
    }
    
    //Function to print the top element of stack.
    public static void headOf_Stack(Stack<Integer> st)
    {
        System.out.println(st.peek());
    }
    
    //Function to search an element in the stack.
    public static boolean find(Stack<Integer> st, int val)
    {
     if(st.search(val)>=0)
     return true;
     else return false;
    }
}