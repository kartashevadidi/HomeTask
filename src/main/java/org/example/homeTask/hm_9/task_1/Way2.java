package org.example.homeTask.hm_9.task_1;

import java.util.Scanner;

public class Way2 {
    public static void main(String[] args) {
        Scanner way = new Scanner(System.in);
        System.out.println("Enter the travel time in seconds");
        int timeWay = way.nextInt();
        long startTime = System.currentTimeMillis();
        long finishTime = System.currentTimeMillis();

        String leftRoad = "||  |  ||\n ||  |  ||\n  ||  |  ||\n   ||  |  ||";
        String rightRoad = "  ||  |  ||\n ||  |  ||";

        int counter = 0;
        while (counter < timeWay) {
            if (counter % 2 == 0) {
                System.out.println(leftRoad);
            } else {
                System.out.println(rightRoad);
            }
            counter++;
        }


    }
}
