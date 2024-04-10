class BST {
  // Function to search a node in BST.
  boolean search(Node root, int x) {
      return func(root,x)!=null;
  }
  Node func(Node root,int x){
      // Your code here
      if(root==null){
          return null;
      }
      else if(root.data==x){
          return root;
      }
      if(root.data<x){
          return func(root.right,x);
      }
      else
      return func(root.left,x);
  }
}
