class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class BinaryTree {
    Node root;

    // Function to count non-leaf nodes
    int countNonLeafNodes(Node node) {
        // If node is null or leaf node, return 0
        if (node == null || (node.left == null && node.right == null)) {
            return 0;
        }
        // Count this node plus non-leaf nodes in left and right subtrees
        return 1 + countNonLeafNodes(node.left) + countNonLeafNodes(node.right);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        int count = tree.countNonLeafNodes(tree.root);
        System.out.println("Count of non-leaf nodes: " + count);
    }
}
