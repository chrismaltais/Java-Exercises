// PreOrder Traversal: Root, Left, Right
void preOrder(Node root) {
    if (root == null) {
        return root;
    }
    System.out.print(root.data + " ");
    preOrder(root.left);
    preORder(root.right);
}

// InOrder Traversal: Left, Root, Right
void inOrder(Node root) {
    if (root == null) {
        return root;
    }
    inOrder(root.left);
    System.out.print(root.data + " ");
    inOrder(root.right);
}

// PostOrder Traversal: Left, Right, Root
void postOrder(Node root) {
    if (root == null) {
        return root;
    }
    postOrder(root.left);
    postOrder(root.right);
    System.out.print(root.data + " ");
}

// LevelOrder Traversal: Breadth-First
void levelOrder(Node root) {
    Queue<Node> queue = new LinkedList<Node>();
    queue.add(root);
    while (!queue.isEmpty()) {
        Node tempNode = queue.poll();
        System.out.print(tempNode.data + " ");
        if (tempNode.left != null) {
            queue.add(tempNode.left);
        }
        if (tempNode.right != null) {
            queue.add(tempNode.right);
        }
    }
}