package oop.concurrency;

public class Bench {
    Integer availableSeats;

    public Bench(Integer availableSeats) {
        this.availableSeats = availableSeats;
    }

    public synchronized void takeASeat(Integer threadIndex) {             // syncronized
        if (availableSeats > 0) {
            System.out.println("Taking a seat from thread " + threadIndex);
            availableSeats--;
            System.out.println("Free seats left " + availableSeats + "in thread" + threadIndex);
        } else {
            System.out.println("No more seats in thread " + threadIndex);
        }
    }

    public void printSyncronizedBlock(Integer threadIndex) {
        synchronized (this) {
            System.out.println(" In synced block in thread " + threadIndex);
        }
        System.out.println("Not syncronized code in thread " + threadIndex);
    }
}

