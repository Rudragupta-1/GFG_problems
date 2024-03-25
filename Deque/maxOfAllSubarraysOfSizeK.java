class Solution
{
    //Function to find maximum of each subarray of size k.
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n-k+1;i++)
        {
            int max=Integer.MIN_VALUE;
            for(int j=i;j<i+k;j++)
            {
                max=Math.max(max,arr[j]);
            }
            list.add(max);
        }
        return list;
    }
}