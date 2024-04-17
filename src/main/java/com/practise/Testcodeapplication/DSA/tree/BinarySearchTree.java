package com.practise.Testcodeapplication.DSA.tree;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BinarySearchTree {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static Node insert(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        } else if (root.data > value) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }
        return root;
    }

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static int checkElementContains(Node root, int value) {
        if (root == null) {
            return -1;
        } else if (root.data == value) {
            log.info("Found :"+root.data);
            return root.data;
        } else if (root.data > value) {
            return checkElementContains(root.left, value);
        } else {
            return checkElementContains(root.right, value);
        }
    }


    public static void main(String[] args) {
        int value[] = {5, 1, 3, 4, 2, 7};
        Node root = null;

        for (int i : value) {
            root = insert(root, i);
        }
        BinarySearchTree.inOrder(root);
        int data=BinarySearchTree.checkElementContains(root, 30);
        log.info("Data is :"+data);

    }
}
