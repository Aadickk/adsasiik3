import java.util.LinkedList;
import java.util.Queue;

public class MyBST {
    Node node;

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

    private boolean contNode(Node node, int value) {
        if (node == null) {
            return false;
        }
        if (value == node.value) {
            return true;
        }
        return value < node.value;

    }

    public boolean contains(int value) {
        return contNode(node, value);
    }

    private Node delete(Node node, int value) {
        if (node == null) {
            return null;
        }
        if (value < node.value) {
            node.left = delete(node.left, value);
            return node;
        }
        if (node.left == null) {
            return node.right;
        }
        if (node.right == null) {
            return node.left;
        }
        if (node.right == null && node.left == null) {
            return null;
        }
        return node;
    }

    public void order(Node node) {
        if (node != null) {
            order(node.left);
            System.out.print(" " + node.value);
            order(node.right);
        }
    }

    public void preOrder(Node node) {
        if (node != null) {
            System.out.println("" + node.value);
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public void levelOrder() {
        if (node == null)
            return;
        Queue<Node> note = new LinkedList<>();
        note.add(node);
        while (!note.isEmpty()){
            Node node = note.remove();
            if(node.left != null){
                note.add(node.left);
            } if(node.right != null){
                note.add(node.right);
            }
        }
    }
}
