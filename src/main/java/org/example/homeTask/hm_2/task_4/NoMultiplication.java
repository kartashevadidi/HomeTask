package org.example.homeTask.hm_2.task_4;

public class NoMultiplication {
    public static void main(String[] args) {
        int firstNumber = 5;
        int secondNumber = 10;
        int result = 0;

        for (int i = 1; i <= secondNumber; i++) {
            result += firstNumber;
        }
        System.out.println(result);
    }
}
