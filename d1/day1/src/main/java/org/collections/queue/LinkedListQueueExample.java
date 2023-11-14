package org.collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("First");
        queue.offer("Second");
        queue.offer("Third");

        System.out.println("Head of queue: " + queue.peek());
        System.out.println("Removed element: " + queue.poll());
        System.out.println("Head of queue after removal: " + queue.peek());
    }
}

