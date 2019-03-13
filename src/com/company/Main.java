package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree();
        Random random = new Random();
        for(int i = 0; i < 100; i++){
            tree.insert(new Node(random.nextInt(101)));
        }
        System.out.println("Обход в глубину:");
        verticalOrder(tree.getRoot());
        System.out.println("\nОбход в ширину:");
        horizontalOrder(tree.getRoot());
    }

    public static void verticalOrder(Node node) {
        if(node == null)
            return;
        verticalOrder(node.getLeftChild());
        System.out.print(node.getId()+ " ");
        verticalOrder(node.getRightChild());
    }

    public static void horizontalOrder(Node node) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);
        Node current;
        while (!queue.isEmpty()) {
            current = queue.poll();
            System.out.print(current.getId() + " ");
            if (current.getLeftChild() != null)
                queue.offer(current.getLeftChild());
            if (current.getRightChild() != null)
                queue.offer(current.getRightChild());
        }
    }

}
