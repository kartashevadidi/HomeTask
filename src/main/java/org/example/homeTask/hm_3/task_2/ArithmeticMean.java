package org.example.homeTask.hm_3.task_2;

public class ArithmeticMean {
    public static void main(String[] args) {
        int[] array = {10, 15, 20, 25};

        int sumOfArrayElements = 0;
        for (int i : array) {
            sumOfArrayElements += i;
        }
        double arithmeticMean = sumOfArrayElements / array.length;
        System.out.println("Среднее арифметическое элементов массива: " + arithmeticMean); // я бы рекомендовал вынести в отдельную переменную среднее число //FIXED
    }
}
