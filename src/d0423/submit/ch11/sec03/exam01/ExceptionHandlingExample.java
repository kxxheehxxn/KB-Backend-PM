package d0423.submit.ch11.sec03.exam01;

public class ExceptionHandlingExample {

    public static void main(String[] args) {
        String[] array = {"100", "1oo"};
        for(int i=0; i<=array.length; i++) {

            try {
                int value = Integer.parseInt(array[i]);
                System.out.println("array[" + i + "]: " + value);
            } catch (NumberFormatException e) {
                System.out.println("예외 :  숫자 형식 오류" + e.getMessage());
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("예외: 배열 초과" + e.getMessage());
            }
        }
    }
}