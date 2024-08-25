import java.util.*;
class MyThreads extends Thread{
    @Override
    public void run(){
    for (int i = 0; i < 5; i++) {
        System.out.println("Hello from MyThread " +Thread.currentThread().getName());
        try {
            Thread.sleep(1000); // Sleep for 1 second
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted!");
        }
    }
}
}
public class Day40P1 {
    public static void main(String[] args) {
        MyThreads t1 = new MyThreads();
        MyThreads t2=new MyThreads();
        t1.start();
        t2.start();
        try {
            t1.join(); // Wait for thread 1 to finish
            t2.join(); // Wait for thread 2 to finish
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted!");
        }

        System.out.println("Main thread finished!");


    }
}
