package oop.concurrency;

public class Main {
    public static void main(String[] args) throws InterruptedException {

/*       MyThread myThread = new MyThread();
       myThread.start();

        MySecondThread mySecondThread = new MySecondThread();         // implementare
        Thread myNewThread = new Thread(mySecondThread);
        myNewThread.start();


        System.out.println("Main thread starts here! ");
        Thread.sleep(1000);
        System.out.println("Main thread still running ");
        Thread.sleep(6000);
        System.out.println("Main thread end here! ");                           */

        Bench myBench = new Bench(1);
        SitTakerAThread seatTaker1 = new SitTakerAThread(myBench,0);
        SitTakerAThread seatTaker2 = new SitTakerAThread(myBench,1);
        seatTaker1.start();
        seatTaker2.start();

    }
}
