class Solution {
  // Function to insert all elements of the array in deque.
  public static ArrayDeque<Integer> deque_Init(int arr[], int n) {
      ArrayDeque<Integer> d=new ArrayDeque<>();
      for(int i=0;i<n;i++)
      {
          d.add(arr[i]);
      }
      return d;
  }
}