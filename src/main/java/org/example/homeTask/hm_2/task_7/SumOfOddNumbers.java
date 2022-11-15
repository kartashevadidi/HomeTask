package org.example.homeTask.hm_2.task_7;

//+
public class SumOfOddNumbers {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        System.out.println("HEllO figure " + sum + "!");
    }
}
