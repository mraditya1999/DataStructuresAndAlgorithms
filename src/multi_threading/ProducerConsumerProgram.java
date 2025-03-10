package multi_threading;

import java.util.LinkedList;
import java.util.Queue;

class SharedQueue {
    private final Queue<Integer> queue = new LinkedList<>();
    private final int capacity = 5;

    synchronized void produce(int value) {
        while (queue.size() == capacity) {
            try { wait(); } catch (InterruptedException e) { e.printStackTrace(); }
        }
        queue.offer(value);
        System.out.println("Produced: " + value);
        notify();
    }

    synchronized void consume() {
        while (queue.isEmpty()) {
            try { wait(); } catch (InterruptedException e) { e.printStackTrace(); }
        }
        int value = queue.poll();
        System.out.println("Consumed: " + value);
        notify();
    }
}

public class ProducerConsumerProgram {
    public static void main(String[] args) {
        SharedQueue sharedQueue = new SharedQueue();

        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                sharedQueue.produce(i);
                try { Thread.sleep(500); } catch (InterruptedException e) { }
            }
        });

        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                sharedQueue.consume();
                try { Thread.sleep(1000); } catch (InterruptedException e) { }
            }
        });

        producer.start();
        consumer.start();
    }
}
