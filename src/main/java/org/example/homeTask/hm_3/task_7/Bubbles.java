package org.example.homeTask.hm_3.task_7;

import java.util.Arrays;

public class Bubbles {
    public static void main(String[] args) {
        int[] array = {19, 1, 9, 25};

        boolean needToSort = true;
        while (needToSort) {
            needToSort = false;

            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {
                    int tmp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = tmp;

                    needToSort = true;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
