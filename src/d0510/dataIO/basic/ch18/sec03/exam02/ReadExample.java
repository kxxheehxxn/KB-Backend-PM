package d0510.dataIO.basic.ch18.sec03.exam02;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;

public class ReadExample {
    public static void main(String[] args) {
        byte[] data;

        try {
            InputStream is = new FileInputStream("test2.db");

            ArrayList<Byte> buffer = new ArrayList<>();
            int byteData;

            while ((byteData = is.read()) != -1) {
                buffer.add((byte) byteData);
                System.out.println("읽은 바이트: " + byteData);
            }

            data = new byte[buffer.size()];
            for (int i = 0; i < buffer.size(); i++) {
                data[i] = buffer.get(i);
            }

            is.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}