package com.practise.Testcodeapplication.DSA.stack;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StackImplUsingLinkedList {
    Node top = null;

    public void push(int value) {
        Node newNode = new Node(value);
        if (top != null) {
            newNode.next = top;
        }
        top = newNode;
    }

    public int pop() {
        if (top == null) {
            return 0;
        } else {
            int result = top.data;
            top = top.next;
            return result;
        }

    }

    public static void main(String[] args) {
        StackImplUsingLinkedList stb = new StackImplUsingLinkedList();
        stb.push(1);
        stb.push(2);
        stb.push(3);
        stb.push(4);
        stb.push(5);

        System.out.println(stb.pop());
        System.out.println(stb.pop());
        System.out.println(stb.pop());
        System.out.println(stb.pop());
        System.out.println(stb.pop());

    }
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}