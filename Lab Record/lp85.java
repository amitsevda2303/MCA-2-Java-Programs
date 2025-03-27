// 85.	Write a program to implement a binary tree and perform in-order traversal.
class Node {
    int data;
    Node left, right;

    Node(int data) { this.data = data; left = right = null; }
}

class lp85 {
    Node root;

    // In-order traversal: Left -> Root -> Right
    void inOrder(Node node) {
        if (node == null) return;
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    public static void main(String[] args) {
        lp85 tree = new lp85();

        // Creating the tree
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("In-Order Traversal:");
        tree.inOrder(tree.root);
    }
}
