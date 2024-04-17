package com.practise.Testcodeapplication.DSA.stack;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public class StackImpl {

    int MAX_SIZE = 10;
    int[] stack = new int[MAX_SIZE];
    int top = -1;

    public boolean isEmpty() {
        return top < 0;
    }

    public boolean isFull() {
        return top == MAX_SIZE - 1;
    }

    public void push(int data) {
        if (isFull()) {
            log.info("Stack is over flow ");
        } else {
            top++;
            stack[top] = data;
            log.info("Top :" + top);
        }
    }

    public int pop() {
        if (isEmpty()) {
            log.info("Stack is underflow .");
            return -1;
        } else {
            int item = stack[top];
            top--;
            log.info("Top value :" + top);
            return item;
        }
    }

    public static void main(String[] args) {
        StackImpl stack = new StackImpl();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        log.info("Stack pop value :" + stack.pop());
        log.info("Stack pop value :" + stack.pop());
        log.info("Stack pop value :" + stack.pop());
    }


}
