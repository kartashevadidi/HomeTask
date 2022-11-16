package org.example.homeTask.hm_3.task_5;

import java.util.Arrays;

public class InvertedArray {
    public static void main(String[] args) {
        int[] array = {15, 16, 32, 48};

        for (int i = 0; i < array.length - i - 1; i++) {
            int tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }
        System.out.println(Arrays.toString(array));
    }
}
