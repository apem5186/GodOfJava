package e.thread.practice;

import java.util.Date;

public class TimerThread extends Thread {

    public void run() {
        printCurrentTime();
    }

    public void reduceTimeGap() {
        long currentTime = System.currentTimeMillis();
        long timeMod = currentTime % 1000;
        try {
            Thread.sleep(1000 - timeMod);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void printCurrentTime() {
        try {
            int count = 0;
            while(count < 10) {
                long currentTime = System.currentTimeMillis();
                System.out.println(new Date(currentTime) + " " + currentTime);
                Thread.sleep(900);
                reduceTimeGap();
                count++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
