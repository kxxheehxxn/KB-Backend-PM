package d0510.dataIO.basic.ch18.sec07.exam02;

import java.io.*;

public class ReadLineExample {
    public static void main(String[] args) {
        try {
            Reader reader = new FileReader("test3.txt");
            BufferedReader br = new BufferedReader(reader);

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}