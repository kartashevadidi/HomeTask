package org.example.homeTask.hm_2.task_1;

public class Sport {
    public static void main(String[] args) {
        int km = 10;
        int day = 7;
        double percent =  0.1;

        for (int i = 0; i < day; i++) {
            km = (int) (km+ (km * percent));
            System.out.println(km );


        }


    }
}
