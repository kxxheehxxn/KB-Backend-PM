package d0423.ch06ExceptionHandling.lecture.exception.sec01;

public class Application {
    public static void main(String[] args) throws Exception {
        ExceptionTest et = new ExceptionTest();
        et.checkEnoughMoney(10000,5000);

    }
}
