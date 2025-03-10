package multi_threading;

public class MultiThreadingThroughThreadClassInSameClass extends Thread {

    public void run(){
        int i=1;
        while(true){
            System.out.println("Thread 1 count: "+ i++);
        }
    }

    public static void main(String[] args) {
        MultiThreadingThroughThreadClassInSameClass obj = new MultiThreadingThroughThreadClassInSameClass();
        obj.start();

        int i=1;
        while(true){
            System.out.println("Thread 2 count: "+ i++);
        }
    }
}
