package Queues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class InBuildExamples {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // add
        queue.add(1);
        queue.add(14);
        queue.add(24);
        queue.add(15);

        //peak - returns head
        System.out.println(queue.peek());

        //remove - first in first out
        System.out.println("Removed..."+ queue.remove());

        // deque
        Deque<Integer> deque = new ArrayDeque<>();

        deque.add(1);
        deque.addLast(14);
        deque.add(24);
        deque.add(15);

        deque.removeLast();
    }

}
