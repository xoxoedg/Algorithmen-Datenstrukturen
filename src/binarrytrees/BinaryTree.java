package binarrytrees;

public class BinaryTree {
        Node root;

        // Function to print preorder traversal
        public static void printPreorder(Node node) {
            if (node == null)
                return;

            // First deal with the node
            System.out.print(node.data + " ");

            // Then recur on left subtree
            printPreorder(node.left);

            // Finally recur on right subtree
            printPreorder(node.right);
        }
}
