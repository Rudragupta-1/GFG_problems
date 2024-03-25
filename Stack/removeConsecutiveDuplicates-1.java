
class Solution
{
    //Function to remove consecutive duplicates from given string using Stack.
    public static String removeConsecutiveDuplicates(String str)
    {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            if(st.isEmpty() || st.peek()!=str.charAt(i))
            {
                st.push(str.charAt(i));
            }
        }
        StringBuilder s=new StringBuilder();
        while(!st.isEmpty())
        {
            s.append(st.pop());
        }
        s.reverse();
        return s.toString();
    }
}