package org.collections.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeExample {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();
        queue.add("First");
        queue.offer("Second");
        queue.offer("Third");

        System.out.println("Head of queue: " + queue.peek());
        System.out.println("Removed element: " + queue.poll());
        System.out.println("Head of queue after removal: " + queue.peek());
    }
}

