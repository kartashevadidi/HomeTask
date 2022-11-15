package org.example.homeTask.hm_2.task_5;

public class InchTranslations {
    public static void main(String[] args) {
//эта строка лишняя
        double centimetresInInch = 2.54;
        System.out.println("Conversion from inches to centimeters");
        for (double b = 0; b <= 20; b++) { // 20 - нужно вынести в переменную и обозначить что это
            System.out.println("_____________"); // если заморочилась с выводом таблицы, то стоило довести до конца, а то кривоватая немного вышла 
            System.out.print("| "+b + " | "); // не отформатировала код
            System.out.println(b * centimetresInInch + " |");
        }
    }
//эта строка лишняя

}
