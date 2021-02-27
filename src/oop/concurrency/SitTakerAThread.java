package oop.concurrency;

public class SitTakerAThread extends Thread {
    private int threadIndex;
    private Bench bench;


    public SitTakerAThread(Bench bench,int threadIndex) {
        this.bench = bench;
        this.threadIndex = threadIndex;
    }

    @Override
    public void run() {
        super.run();
        bench.takeASeat(threadIndex);
        bench.printSyncronizedBlock(threadIndex);
    }
}
