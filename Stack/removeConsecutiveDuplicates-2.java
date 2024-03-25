class Solution
{
    //Function to remove pair of duplicates from given string using Stack.
    public static String removePair(String str)
    {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            if(st.isEmpty())
            st.push(str.charAt(i));
            else{
                if(st.peek()==str.charAt(i))
                {
                    st.pop();
                }
                else{
                    st.push(str.charAt(i));
                }
            }
            
        }
        StringBuilder s=new StringBuilder();
        while(!st.isEmpty())
            s.append(st.pop());
            return s.reverse().toString();
    }
}