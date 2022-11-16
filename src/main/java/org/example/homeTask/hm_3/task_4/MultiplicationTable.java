package org.example.homeTask.hm_3.task_4;

public class MultiplicationTable {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
        };
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array[1].length; j++) {
                System.out.println(array[0][i] + " x " + array[1][j] + " = " + array[0][i] * array[1][j]);
            }
            System.out.println();
        }
    }
}
