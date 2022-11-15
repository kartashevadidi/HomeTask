package org.example.homeTask.hm_2.task_3;

public class Calculations {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; ; i = i * 2) {
            if (i > 256) {
                break;
            }
            sum += i;
        }
        System.out.println(sum);
    }
}
