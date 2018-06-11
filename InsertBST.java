// You are given a pointer to the root of a binary search tree and a value to be inserted into the tree. 
// Insert this value into its appropriate position in the binary search tree 
// and return the root of the updated binary tree. You just have to complete the function.
// Runtime: O(logn)


static Node Insert(Node root,int value) {
    if (root == null) {
        Node node = new Node();
        node.data = value;
        node.left = null;
        node.right = null;
        root = node;
    } else if (root.data > value) {
        root.left = Insert(root.left, value);
    } else if (root.data < value) {
        root.right = Insert(root.right, value);
    }
    
    return root;
}