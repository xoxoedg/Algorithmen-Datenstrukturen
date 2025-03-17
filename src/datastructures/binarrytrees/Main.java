package datastructures.binarrytrees;

public class Main {

    public static void main(String[] args) {
     /*   Node node1 = new Node(8);
        Node node2 = new Node(3);
        Node node3 = new Node(5);
        Node node4 = new Node(1);

        node1.left = node2;
        node1.right = node3;
        node1.left.left = node4;*/


        BinaryTree tree = new BinaryTree();

        // Constructing the binary tree
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(6);

        BinaryTree.printPreorder(tree.root);
    }
}
