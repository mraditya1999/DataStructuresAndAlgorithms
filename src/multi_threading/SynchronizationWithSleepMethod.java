package multi_threading;

class MyData4 {
    void display(String str) {
        synchronized (this) {
            for (int i = 0; i < str.length(); i++) {
                System.out.print(str.charAt(i) + " ");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
            System.out.println();
        }
    }
}

class MyThread7 extends Thread {
    MyData4 obj;

    MyThread7(MyData4 obj) {
        this.obj = obj;
    }

    public void run() {
        obj.display("Hello World");
    }
}

class MyThread8 extends Thread {
    MyData4 obj;

    MyThread8(MyData4 obj) {
        this.obj = obj;
    }

    public void run() {
        obj.display("Welcome");
    }
}

public class SynchronizationWithSleepMethod {
    public static void main(String[] args) {
        MyData4 obj = new MyData4();
        MyThread7 t1 = new MyThread7(obj);
        MyThread8 t2 = new MyThread8(obj);

        t1.start();
        t2.start();
    }
}
