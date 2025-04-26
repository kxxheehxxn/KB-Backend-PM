package d0424.ch14.sec03.exam02;

import java.awt.Toolkit;

public class BeepPrintExample {
    public static void main(String[] args) {
        Runnable beepTask = new Runnable() {
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for (int i = 0; i < 5; i++) {
                    toolkit.beep();
                    try {
                        Thread.sleep(500); // 0.5초 대기
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Thread beepThread = new Thread(beepTask);
        beepThread.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500); // 0.5초 대기
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
