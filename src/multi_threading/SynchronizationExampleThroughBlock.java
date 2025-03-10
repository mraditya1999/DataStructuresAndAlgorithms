//WITHOUT SYNCHRONIZATION
//package multi_threading;
//class MyData1 {
//    void display(String str) {
//         for (int i = 0; i < str.length(); i++) {
//                System.out.print(str.charAt(i) + " ");
//            }
//            System.out.print(" ");
//    }
//}
//
//class MyThread3 extends Thread {
//    MyData1 obj;
//
//    MyThread3(MyData1 obj) {
//        this.obj = obj;
//    }
//
//    public void run() {
//        obj.display("Hello World");
//    }
//}
//
//class MyThread4 extends Thread {
//    MyData1 obj;
//
//    MyThread4(MyData1 obj) {
//        this.obj = obj;
//    }
//
//    public void run() {
//        obj.display("Welcome");
//    }
//}
//
//public class SynchronizationExampleThroughBlock {
//    public static void main(String[] args) {
//        MyData1 obj = new MyData1();
//        MyThread3 t1 = new MyThread3(obj);
//        MyThread4 t2 = new MyThread4(obj);
//
//        t1.start();
//        t2.start();
//    }
//}

package multi_threading;

class MyData1 {
    void display(String str) {
        synchronized (this) {
            for (int i = 0; i < str.length(); i++) {
                System.out.print(str.charAt(i) + " ");
            }
            System.out.println();
        }
    }
}

class MyThread3 extends Thread {
    MyData1 obj;

    MyThread3(MyData1 obj) {
        this.obj = obj;
    }

    public void run() {
        obj.display("Hello World");
    }
}

class MyThread4 extends Thread {
    MyData1 obj;

    MyThread4(MyData1 obj) {
        this.obj = obj;
    }

    public void run() {
        obj.display("Welcome");
    }
}

public class SynchronizationExampleThroughBlock {
    public static void main(String[] args) {
        MyData1 obj = new MyData1();
        MyThread3 t1 = new MyThread3(obj);
        MyThread4 t2 = new MyThread4(obj);

        t1.start();
        t2.start();
    }
}
