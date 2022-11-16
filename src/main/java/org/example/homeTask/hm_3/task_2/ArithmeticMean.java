package org.example.homeTask.hm_3.task_2;

// +
public class ArithmeticMean {
    public static void main(String[] args) {
        int[] array = {10, 15, 20, 25};

        int sumOfArrayElements = 0;
        for (int i : array) {
            sumOfArrayElements += i;
        }
        System.out.println("Среднее арифметическое элементов массива: " + (double) sumOfArrayElements / array.length); // я бы рекомендовал вынести в отдельную переменную среднее число
    }
}
