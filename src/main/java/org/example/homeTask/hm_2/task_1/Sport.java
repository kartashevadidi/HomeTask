package org.example.homeTask.hm_2.task_1;

public class Sport {
    public static void main(String[] args) {
        double km = 10;
        int day = 7;
        double percent = 0.1;
        double sumTotal;
        sumTotal = km;

        for (int i = 0; i < day; i++) {
            km = (km + (km * percent));
            sumTotal += km;
        }
        System.out.println(sumTotal);
    }
}
