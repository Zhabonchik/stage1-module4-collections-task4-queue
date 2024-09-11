package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.add(firstQueue.poll());
        arrayDeque.add(firstQueue.poll());
        arrayDeque.add(secondQueue.poll());
        arrayDeque.add(secondQueue.poll());
        while (!firstQueue.isEmpty() || !secondQueue.isEmpty()) {
            if (!firstQueue.isEmpty()) {
                firstQueue.add(arrayDeque.pollLast());
                arrayDeque.add(firstQueue.poll());
                arrayDeque.add(firstQueue.poll());
            }
            if (!secondQueue.isEmpty()) {
                secondQueue.add(arrayDeque.pollLast());
                arrayDeque.add(secondQueue.poll());
                arrayDeque.add(secondQueue.poll());
            }
        }
        return arrayDeque;
    }
}
