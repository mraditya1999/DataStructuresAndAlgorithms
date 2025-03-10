package multi_threading;

public class MultiThreadingThroughRunnableInterfaceInSameClass implements Runnable {
    public void run() {
        int i = 1;
        while (true) {
            System.out.println("Thread 1 count: " + i++);
        }
    }

    public static void main(String[] args) {
        MultiThreadingThroughRunnableInterfaceInSameClass obj = new MultiThreadingThroughRunnableInterfaceInSameClass();
        Thread thread1 = new Thread(obj);
        thread1.start();

        int i = 1;
        while (true) {
            System.out.println("Thread 2 count: " + i++);
        }

    }
}
