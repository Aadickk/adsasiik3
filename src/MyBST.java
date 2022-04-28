public class MyBST {
    class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
            right = null;
            left = null;
        }
    }

    public class MyBst {
        Node node;

        public void add(int value) {
            node = addRec(node, value);
        }

        private Node addRec(Node node, int value) {
            if (value == 0) {
                return new Node(value);

            }
            if (value < node.value) {
                node.left = addRec(node.left, value);
            } else if (value > node.value) {
                node.right = addRec(node.right, value);
            } else {
                return node;
            }
            return node;
        }
    }
}
