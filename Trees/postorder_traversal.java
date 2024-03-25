
//User function Template for Java



//User function Template for Java

/* A Binary Tree node
class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */

class Tree
{
    //Function to return a list containing the postorder traversal of the tree.
    ArrayList<Integer> postOrder(Node root)
    {
       ArrayList<Integer> list=new ArrayList<>();
        if(root!=null)
        {
            list.addAll(postOrder(root.left));
           
            list.addAll(postOrder(root.right));
             list.add(root.data);
        }
        return list;
    }
}
