package d0423.ch06ExceptionHandling.lecture.exception.sec02.exception;

public class MoneyNagativeException extends Exception{
    public MoneyNagativeException() {
    }

    public MoneyNagativeException(String message) {
        super(message);
    }
}
