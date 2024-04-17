package com.practise.Testcodeapplication.DSA.queue;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class QueueImplementation {

    int frond, rear, size;
    int[] queue;

    public QueueImplementation(int capacity) {
        this.size = capacity;
        queue = new int[capacity];
        frond = 0;
        rear = 0;
    }

    public void enQueue(int item) {
        if (size == rear) {
            log.info("Queue if over flow .");
        } else {
            queue[rear] = item;
            rear++;
        }
    }

    public int deQueue() {
        int item=0;
        if (frond == -1) {
            log.info("Queue is under flow ");
        } else {
            item = queue[frond];
            frond++;
        }
        return item;
    }

    public void displayQueueValue() {
        for (int i = frond; i < rear; i++) {
            System.out.print(" " + queue[i]);
        }
    }


    public static void main(String[] args) {

        QueueImplementation queue = new QueueImplementation(4);
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.displayQueueValue();
        System.out.println();
        System.out.println("Dequeue :"+queue.deQueue());
        System.out.println();
        System.out.println("Dequeue :"+queue.deQueue());


    }
}
