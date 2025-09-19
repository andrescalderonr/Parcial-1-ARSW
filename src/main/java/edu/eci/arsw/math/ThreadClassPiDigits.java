package edu.eci.arsw.math;

import java.util.ArrayList;

public class ThreadClassPiDigits extends Thread{
    private int start;
    private int end;
    ArrayList<byte[]> digitsFound;

    public void ThreadClassPiDigitsh(int start, int end){
        this.start =start;
        this.end = end;
    }



    @Override
    public void run() {
        while (start < end){
            digitsFound.add(PiDigits.getDigits(start,end));
            start++;
        }
    }


}
