
class Solution
{
    //Function to find largest rectangular area possible in a given histogram.
    public static long getMaxArea(long hist[], long n) 
    {
        Stack<Long> st=new Stack<>();
        var nsl[]=new long[n];
        var nsr[]=new long[n];
        //nsl
        for(var i=0;i<n;i++)
        {
            while(!st.isEmpty()&& hist[st.peek()]>=hist[i])
            {
                st.pop();
            }
            var x=st.isEmpty()?-1:st.peek();
            st.push(i);
            nsl[i]=x;
        }
        st.clear();
        //nsr
        for(var i=n-1;i>=0;i--)
        {
             while(!st.isEmpty()&& hist[st.peek()]>=hist[i])
            {
                st.pop();
            }
            var x=st.isEmpty()?n:st.peek();
            st.push(i);
            nsl[i]=x;
        }
    
    long max=Long.MIN_VALUE;
    for(var i=0;i<n;i++)
    {
        var height=hist[i];
        var width=nsr[i]-nsl[i]-1;
        var currArea=height*width;
        max=Math.max(max,currArea);
    }
    return max;
}
    }

