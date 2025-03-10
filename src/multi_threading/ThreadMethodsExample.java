package multi_threading;

// Implementing Runnable interface
class MyRunnable implements Runnable {
    public void run() {
        try {
            Thread.sleep(1000); // Simulating some work
            Thread.yield(); // Yielding execution to other threads
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " was interrupted.");
        }
        System.out.println(Thread.currentThread().getName() + " is running.");
    }
}

public class ThreadMethodsExample {

    public static void main(String[] args) {
        // Creating threads using different constructors
        Thread thread1 = new Thread(new MyRunnable()); // Thread(Runnable r)
        Thread thread2 = new Thread(new MyRunnable(), "Thread2"); // Thread(Runnable r, String name)
        Thread thread3 = new Thread(new MyRunnable(), "Thread3"); // Thread(Runnable r, String name)

        // Setting thread names (setter method)
        thread1.setName("Thread1");

        // Setting priorities (setter method)
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);

        // Setting daemon status (setter method)
        thread1.setDaemon(true);

        // Starting threads (instance method)
        thread1.start();
        thread2.start();
        thread3.start();

        // Using various Thread methods (instance methods)
        System.out.println("Thread1 ID: " + thread1.getId()); // instance method
        System.out.println("Thread2 ID: " + thread2.getId()); // instance method
        System.out.println("Thread3 ID: " + thread3.getId()); // instance method

        System.out.println("Thread1 name: " + thread1.getName()); // getter method
        System.out.println("Thread2 name: " + thread2.getName()); // getter method
        System.out.println("Thread3 name: " + thread3.getName()); // getter method

        System.out.println("Thread1 priority: " + thread1.getPriority()); // getter method
        System.out.println("Thread2 priority: " + thread2.getPriority()); // getter method
        System.out.println("Thread3 priority: " + thread3.getPriority()); // getter method

        System.out.println("Thread1 is daemon: " + thread1.isDaemon()); // instance method
        System.out.println("Thread2 is daemon: " + thread2.isDaemon()); // instance method
        System.out.println("Thread3 is daemon: " + thread3.isDaemon()); // instance method

        System.out.println("Thread1 state: " + thread1.getState()); // instance method
        System.out.println("Thread2 state: " + thread2.getState()); // instance method
        System.out.println("Thread3 state: " + thread3.getState()); // instance method

        System.out.println("Thread1 thread group: " + thread1.getThreadGroup()); // instance method
        System.out.println("Thread2 thread group: " + thread2.getThreadGroup()); // instance method
        System.out.println("Thread3 thread group: " + thread3.getThreadGroup()); // instance method

        System.out.println("Thread1 is alive: " + thread1.isAlive()); // instance method
        System.out.println("Thread2 is alive: " + thread2.isAlive()); // instance method
        System.out.println("Thread3 is alive: " + thread3.isAlive()); // instance method

        try {
            thread1.join(); // instance method
            thread2.join(); // instance method
            thread3.join(); // instance method
        } catch (InterruptedException e) {
            System.out.println("Threads were interrupted.");
        }

        System.out.println("Thread1 is interrupted: " + thread1.isInterrupted()); // instance method
        System.out.println("Thread2 is interrupted: " + thread2.isInterrupted()); // instance method

        // Using static methods of Thread class
        System.out.println("Active thread count: " + Thread.activeCount()); // static method
        System.out.println("Current thread name: " + Thread.currentThread().getName()); // static method
        Thread.dumpStack(); // static method
    }
}
