// User function Template for Java

/* A Binary Tree node

class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */
class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> list=new ArrayList<>();
        if(root!=null)
        {
            list.addAll(inOrder(root.left));
            list.add(root.data);
            list.addAll(inOrder(root.right));
        }
        return list;
    }
}
