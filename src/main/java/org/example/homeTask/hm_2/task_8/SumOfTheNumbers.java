package org.example.homeTask.hm_2.task_8;

public class SumOfTheNumbers {
    public static void main(String[] args) {
        int sumOfEvenNumbers = 0;
        int sumOfOddNumbers = 0;

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                sumOfEvenNumbers = sumOfEvenNumbers + i;
            } else {
                sumOfOddNumbers = sumOfOddNumbers + i;
            }
        }
        System.out.println("sumOfEvenNumbers " + sumOfEvenNumbers);
        System.out.println("sumOfOddNumbers " + sumOfOddNumbers);
        System.out.println();
        int totalSum = sumOfEvenNumbers + sumOfOddNumbers;
        System.out.println("TotalSum " + totalSum);
    }
}

