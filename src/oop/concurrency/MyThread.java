package oop.concurrency;

public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 1; i <= 5; i++) {
            System.out.println("In my thread at step " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
