package multi_threading;

class MyThread1 extends Thread{
    public void run(){
        int i=1;
        while(true){
            System.out.println("Thread 1 count: " + i++);
        }
    }
}

public class MultiThreadingThroughThreadClassInDifferentClass {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        myThread1.start();

        int i=1;
        while(true){
            System.out.println("Thread 2 count: " + i++);
        }
    }
}
