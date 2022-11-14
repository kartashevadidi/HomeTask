package org.example.homeTask.hm_2.task_9;

public class Drawing {
    public static void main(String[] args) {
        int i, j, count = 4;
//Tringle
        for (i = 1; i <= count; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println(" ");
// Reverse Tringle
        for (i = count; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}

