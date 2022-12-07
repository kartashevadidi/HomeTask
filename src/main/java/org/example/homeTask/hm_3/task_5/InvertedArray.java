package org.example.homeTask.hm_3.task_5;

import java.util.Arrays;

public class InvertedArray {
    public static void main(String[] args) {
        int[] array = {15, 16, 32, 48, 19, 24, 1};

        int rightIndex = array.length - 1;
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[rightIndex];
            array[rightIndex] = tmp;
            rightIndex--;
            System.out.println(Arrays.toString(array));
        
        /*
        Как вариант тебе альтернативный вариант кода, вдруг больше понравится
         Ок, почитала что такое  i < array.length / 2

        }
        */
        }
    }
}
