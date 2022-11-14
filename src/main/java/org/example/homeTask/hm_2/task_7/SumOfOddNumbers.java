package org.example.homeTask.hm_2.task_7;

public class SumOfOddNumbers {
    public static void main(String[] args) {

        int b = 0;

        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                b = b + i;

            }
        }
        System.out.println("HEllO figure " + b + "!");
    }
}
