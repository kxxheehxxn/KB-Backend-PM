package d0423.ch06ExceptionHandling.lecture.exception.sec03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application {
    public static void main(String[] args) {
        BufferedReader in = null;

        try {
            in = new BufferedReader(new FileReader("hellod0423.txt"));
            String s;
            in.close();
            while ((s = in.readLine()) != null) {
                System.out.println(s);
            }

            //catch 블럭을 여러개 작성할 때에는 상위(부모) 타입이 하단에 오고
            //하위(자식)타입이 상단에 온다.
        }
//        } catch (IOException e) {
//            System.out.println("IOException 발생");
//        } catch (FileNotFoundException e) {
//            System.out.println("FileNotFoundException 발생");
//        }
        catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException 발생");
        } catch (IOException e) {
            System.out.println("IOException 발생");
        }
    }
}
