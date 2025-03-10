package multi_threading;

class MyData2 {
    synchronized void display(String str) {
            for (int i = 0; i < str.length(); i++) {
                System.out.print(str.charAt(i) + " ");
            }
            System.out.println();
    }
}

class MyThread5 extends Thread {
    MyData2 obj;

    MyThread5(MyData2 obj) {
        this.obj = obj;
    }

    public void run() {
        obj.display("Hello World");
    }
}

class MyThread6 extends Thread {
    MyData2 obj;

    MyThread6(MyData2 obj) {
        this.obj = obj;
    }

    public void run() {
        obj.display("Welcome");
    }
}

public class SynchronizationExampleThroughMethod {
    public static void main(String[] args) {
        MyData2 obj = new MyData2();
        MyThread5 t1 = new MyThread5(obj);
        MyThread6 t2 = new MyThread6(obj);

        t1.start();
        t2.start();
    }
}
