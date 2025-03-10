package multi_threading;

class SharedResource {
    synchronized void printNumbers(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i + " " + n * i);
        }
    }
}

class MyThread9 extends Thread {
    SharedResource shared;
    MyThread9(SharedResource shared) {
        this.shared = shared;
    }
    public void run() {
        shared.printNumbers(9);
    }
}

public class MultipleOfNUsingSynchronization {
    public static void main(String[] args) {
        SharedResource shared = new SharedResource();
        MyThread9 t1 = new MyThread9(shared);
        MyThread9 t2 = new MyThread9(shared);

        t1.start();
        t2.start();


    }
}
