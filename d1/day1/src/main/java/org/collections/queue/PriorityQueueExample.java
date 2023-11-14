package org.collections.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("C");
        queue.add("A");
        queue.add("B");

        System.out.println("Head of queue: " + queue.peek());
        while (!queue.isEmpty()) {
            System.out.println("Removed element: " + queue.poll());
        }
    }
}

