package org.example.homeTask.hm_2.task_9;

public class Drawing {
    public static void main(String[] args) {
        int size = 4;
//Triangle
        for (int i = 1; i <= size; i++) { // i = 1 -> int i = 1, не вижу смысла выносить i,j за пределы цикла // вроде фиксед
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println(" ");
// Reverse Triangle
        for (int i = size; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}

