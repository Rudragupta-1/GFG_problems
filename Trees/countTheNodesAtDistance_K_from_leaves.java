//User function Template for Java

// class Node  
// { 
//     int data; 
//     Node left, right; 
   
//     public Node(int d)  
//     { 
//         data = d; 
//         left = right = null; 
//     } 
// }

class Solution {
    static HashSet<Node> set = new HashSet<>();

    // Function to return count of nodes at a given distance from leaf nodes.
    int printKDistantfromLeaf(Node root, int k) {
        set.clear();
        func(root, new ArrayList<>(), k);
        return set.size();
    }

    void func(Node root, List<Node> list, int k) {
        if (root == null) {
            return;
        }
        list.add(root);
        if (root.left == null && root.right == null) {
            if (list.size() > k) {
                // Adding the value of the node
                set.add(list.get(list.size() - k - 1));
                // return;
            }
        }
        // Continue traversing both subtrees
        func(root.left, list, k);
        func(root.right, list, k);
        // Remove the last node as we backtrack
        list.remove(list.size() - 1);
    }
}
