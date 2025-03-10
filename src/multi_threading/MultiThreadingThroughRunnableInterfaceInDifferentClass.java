package multi_threading;

class MyThread2 implements Runnable{
    public void run(){
        int i=1;
        while(true){
            System.out.println("Thread 1 count: "+ i++);
        }
    }
}

public class MultiThreadingThroughRunnableInterfaceInDifferentClass {
    public static void main(String[] args) {
        MyThread2 myThread2 = new MyThread2();
        Thread t1 = new Thread(myThread2);
        t1.start();

        int i=1;
        while(true){
            System.out.println("Thread 2 count: "+ i++);
        }
    }
}
