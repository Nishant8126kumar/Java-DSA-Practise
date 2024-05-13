package com.practise.Testcodeapplication.DSA.linkedList;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FindMidInLinkedList {
    Node head = null;

    public void addNode(int data) {
        Node node = new Node(data);

        if (head == null)
            head = node;
        else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = node;
        }

    }

    public int getLinkedListLength() {
        int length = 0;
        if (head != null) {
            Node currentNode = head;
            while (currentNode != null) {
                currentNode = currentNode.next;
                length++;
            }
        }
        return length;
    }

    public void printAllLinkedListElement() {
        if (head != null) {
            Node currentNode = head;
            while (currentNode != null) {
                System.out.print(currentNode.data + " ");
                currentNode = currentNode.next;
            }
        } else {
            log.info("List is empty :");
        }
    }

    public void printLinkedListMidElement() {
        if (head != null) {
            Node currentNode = head;
            int length = this.getLinkedListLength();
            int lenMid = length / 2;
            while (lenMid != 0) {
                currentNode = currentNode.next;
                lenMid--;
            }
            log.info("Mid element is :"+currentNode.data);

        }else {
            log.info("List is empty .");
        }
    }

    public static void main(String[] args) {
        FindMidInLinkedList obj = new FindMidInLinkedList();
        obj.addNode(10);
        obj.addNode(20);
        obj.addNode(30);
        obj.addNode(40);
        obj.addNode(50);
        log.info("List length :" + obj.getLinkedListLength());
        obj.printAllLinkedListElement();
        obj.printLinkedListMidElement();
    }
}
