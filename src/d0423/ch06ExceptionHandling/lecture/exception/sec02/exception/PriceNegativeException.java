package d0423.ch06ExceptionHandling.lecture.exception.sec02.exception;

public class PriceNegativeException extends Exception{
    public PriceNegativeException() {
    }

    public PriceNegativeException(String message) {
        super(message);
    }
}
