//User function Template for Java



// class Node{
//     int data;
//     Node left,right;
//     Node(int d){
//         data=d;
//         left=right=null;
//     }
// }

class BinaryTree {
  // Function to return a list containing the preorder traversal of the tree.
  static ArrayList<Integer> preorder(Node root) {
      ArrayList<Integer> list = new ArrayList<>(); // Instantiate ArrayList
      if (root != null) {
          list.add(root.data);
          list.addAll(preorder(root.left)); // AddAll the elements of the left subtree
          list.addAll(preorder(root.right)); // AddAll the elements of the right subtree
      }
      return list;
  }
}