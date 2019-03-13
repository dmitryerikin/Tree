package com.company;

public class Tree {
    private Node root;

    public Tree() {
        root = null;
    }

    public boolean insert(Node node) {
        Node parent;
        Node current = root;

        if(root == null) {
            root = node;
        } else {
            while (true) {
                parent = current;
                if(node.getId() == current.getId())
                    return false;
                else if(node.getId() < current.getId()) {
                    current = current.getLeftChild();
                    if(current == null) {
                        parent.setLeftChild(node);
                        break;
                    }
                } else if (node.getId() > current.getId()) {
                    current = current.getRightChild();
                    if(current == null) {
                        parent.setRightChild(node);
                        break;
                    }
                }
            }
        }
        return true;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }
}
