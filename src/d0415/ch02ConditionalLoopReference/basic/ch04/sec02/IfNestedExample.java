package d0415.ch02ConditionalLoopReference.basic.ch04.sec02;

public class IfNestedExample {
    public static void main(String[] args) {
        int score = 95;
        System.out.println("점수:" + score);

        String grade = "";
        if (score >= 81 && score < 90) {
            grade += "B";
            if (score >= 85) {
                grade += "+";
            }
        } else if (score >= 90) {
            grade += "A";
            if (score >= 95) {
                grade += "+";
            }
        }else {
            grade+="F";
        }
        System.out.println("학점:" + grade);
    }
}
