package com.practise.Testcodeapplication.DSA.linkedList;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SinglyLinkedList {

    public Node head = null;

    public void addNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    public int deleteValueFromList(int value) {
        Node currentNode = head;
        Node previousNode = null;
        if (currentNode == null) {
            log.info("List is empty we can't deleted");
        }
        if (currentNode != null && currentNode.data == value) {
            head = currentNode.next;
            return value;
        }

        while (currentNode != null) {
            if (currentNode.data == value) {
                previousNode.next=currentNode.next;
                break;
            } else {
                previousNode=currentNode;
                currentNode = currentNode.next;
            }
        }
//        if (currentNode != null) {
//            previousNode.next = currentNode.next;
//            log.info("");
//        }
        return value;
    }

    public void addNodeWithPosition(int data, int position) {
        Node newNode = new Node(data);

        int listPosition = 1;
        if (head == null) {
            head = newNode;
        } else {
            Node currentNode = head;
            while (currentNode.next != null) {
                if (listPosition == position - 1) {
                    newNode.next = currentNode.next;
                    currentNode.next = newNode;
                }
                listPosition++;
                currentNode = currentNode.next;
            }
        }
    }

    public int countNodeInLinkedList() {
        int count = 0;
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
            count++;
        }
        return count + 1;
    }

    //display() will display all the nodes present in the list
    public void display() {
        Node currentValue = head;
        if (currentValue == null)
            log.info("List is empty :");

        while (currentValue != null) {
            System.out.print(" " + currentValue.data);
            currentValue = currentValue.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        SinglyLinkedList sList = new SinglyLinkedList();
        //Add nodes to the list
        sList.addNode(1);
        sList.addNode(2);
        sList.addNode(3);
        sList.addNode(4);
        sList.addNode(5);

//
        sList.display();
        sList.addNodeWithPosition(11, 3);
        sList.display();
        sList.deleteValueFromList(5);
        sList.display();

        System.out.println("Linked List node count :" + sList.countNodeInLinkedList());


//        sList.deleteValueFromList(8);
//        sList.addNode(5);
//        sList.addNode(6);
//        sList.addNode(7);
//        sList.addNode(8);
//        sList.addNode(9);
//        sList.addNode(10);
//
        //Displays the nodes present in the list
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
