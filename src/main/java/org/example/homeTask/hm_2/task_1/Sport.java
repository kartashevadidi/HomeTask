package org.example.homeTask.hm_2.task_1;

public class Sport {
    public static void main(String[] args) {
        double defaultDailyDistance = 10; // что такое км? defaultDailyDistance - думаю так информативнее будет  FIXED
        int days = 7; // это количество дней, а не конкретный день, поэтому days лучше  FIXED
        double coefficient = 0.1; // это не процент, а коэффициент дневного прироста. Процент - это 10%. Надо переименовать  FIXED
        double sumTotal;
        sumTotal = defaultDailyDistance;

        for (int i = 1; i < days; i++) { // у тебя на 1 больше вышло  FIXED
            defaultDailyDistance = defaultDailyDistance + defaultDailyDistance * coefficient; // (km * percent) - я думаю скобки не нужны FIXED
            sumTotal += defaultDailyDistance;
        }
        System.out.println(sumTotal);
    }
}
