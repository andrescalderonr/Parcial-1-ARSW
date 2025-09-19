package edu.eci.arsw.math;

import java.util.ArrayList;

public class ThreadClassPiDigits extends Thread {
    private int start;
    private int end;
    private Object lock = new Object();
    ArrayList<byte[]> digitsFound;

    public ThreadClassPiDigits(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            try {
                digitsFound.add(PiDigits.getDigits(i, end, 0));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
