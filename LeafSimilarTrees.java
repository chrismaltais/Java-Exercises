public boolean leafSimilar(TreeNode root1, TreeNode root2) {
    ArrayList<Integer> listOfLeaves1 = new ArrayList();
    ArrayList<Integer> listOfLeaves2 = new ArrayList();
    dfsLeafNodes(root1, listOfLeaves1);
    dfsLeafNodes(root2, listOfLeaves2);
    return listOfLeaves1.equals(listOfLeaves2);
}

public static void dfsLeafNodes(TreeNode root, ArrayList<Integer> list) {
    if (root.left == null && root.right == null) {
        list.add(root.val);
    } else {
        if (root.left != null) {
            dfsLeafNodes(root.left, list);
        }
        if (root.right != null) {
            dfsLeafNodes(root.right, list);
        }
    }
}
