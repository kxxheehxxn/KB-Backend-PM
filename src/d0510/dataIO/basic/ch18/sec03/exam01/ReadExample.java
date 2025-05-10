package d0510.dataIO.basic.ch18.sec03.exam01;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("test1.db");

            int data;
            while ((data = is.read()) != -1) {
                System.out.println("읽은 바이트 값: " + data);
            }

            is.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}