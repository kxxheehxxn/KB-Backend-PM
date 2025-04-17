package d0415.ch02ConditionalLoopReference.advanced.sec04;

public class MaxInFor {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 8, 2};
        int maxValue = -1;

        // 배열을 순회하며 최대값을 찾음
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }

        // 최대값 출력
        System.out.println("최대값: " + maxValue);
    }
}
