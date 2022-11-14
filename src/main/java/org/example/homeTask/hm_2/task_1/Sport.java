package org.example.homeTask.hm_2.task_1;

public class Sport {
    public static void main(String[] args) {
        double km = 10; // что такое км? defaultDailyDistance - думаю так информативнее будет
        int day = 7; // это количество дней, а не конкретный день, поэтому days лучше
        double percent = 0.1; // это не процент, а коэффициент дневного прироста. Процент - это 10%. Надо переименовать
        double sumTotal;
        sumTotal = km;

        for (int i = 0; i < day; i++) { // у тебя на 1 больше вышло
            km = (km + (km * percent)); // (km * percent) - я думаю скобки не нужны
            sumTotal += km;
        }
        System.out.println(sumTotal);
    }
}
