package Queues;

import java.util.Queue;

public class Main {
    public static void main(String[] args) throws Exception{
        CustomQueue queue = new CustomQueue(4);

        queue.insert(1);
        queue.insert(14);
        queue.insert(24);
        queue.insert(15);

        queue.remove();

    }
}
