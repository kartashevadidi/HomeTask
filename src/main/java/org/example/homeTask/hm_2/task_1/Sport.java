package org.example.homeTask.hm_2.task_1;

public class Sport {
    public static void main(String[] args) {
        double defaultDailyDistance = 10;
        int days = 7;
        double coefficient = 0.1;
        double sumTotal;
        sumTotal = defaultDailyDistance;

        for (int i = 1; i < days; i++) {
            defaultDailyDistance = defaultDailyDistance + defaultDailyDistance * coefficient;
            sumTotal += defaultDailyDistance;
        }
        System.out.println(sumTotal);
    }
}
