package multi_threading;

class SharedPrinter {
    private boolean isOddTurn = true;

    synchronized void printOdd(int num) {
        while (!isOddTurn) { // Wait if it's not odd turn
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println(Thread.currentThread().getName() + " - " + num);
        isOddTurn = false; // Now it's even turn
        notify();
    }

    synchronized void printEven(int num) {
        while (isOddTurn) { // Wait if it's not even turn
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println(Thread.currentThread().getName() + " - " + num);
        isOddTurn = true; // Now it's odd turn
        notify();
    }
}

class OddThread extends Thread {
    private final SharedPrinter printer;
    private final int max;

    OddThread(SharedPrinter printer, int max) {
        this.printer = printer;
        this.max = max;
    }

    public void run() {
        for (int i = 1; i <= max; i += 2    ) {
            printer.printOdd(i);
        }
    }
}

class EvenThread extends Thread {
    private final SharedPrinter printer;
    private final int max;

    EvenThread(SharedPrinter printer, int max) {
        this.printer = printer;
        this.max = max;
    }

    public void run() {
        for (int i = 2; i <= max; i += 2) {
            printer.printEven(i);
        }
    }
}

public class OddEvenUsingSynchronization {
    public static void main(String[] args) {
        SharedPrinter printer = new SharedPrinter();
        int max = 10;

        Thread oddThread = new OddThread(printer, max);
        Thread evenThread = new EvenThread(printer, max);

        oddThread.setName("OddThread");
        evenThread.setName("EvenThread");

        oddThread.start();
        evenThread.start();
    }
}
