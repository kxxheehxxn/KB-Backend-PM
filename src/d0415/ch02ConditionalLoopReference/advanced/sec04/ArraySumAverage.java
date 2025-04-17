package d0415.ch02ConditionalLoopReference.advanced.sec04;

public class ArraySumAverage {
    public static void main(String[] args) {
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };

        int totalSum = 0;
        int totalCount = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                totalSum += array[i][j];
                totalCount++;
            }
        }

        double average = (double) totalSum / totalCount;

        System.out.println("전체 합: " + totalSum);
        System.out.println("전체 평균: " + average);
    }
}
