package org.example.homeTask.hm_3.task_1;

import java.util.Scanner;

public class TaskScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[3];

        System.out.println("Введите первое число");
        array[0] = scanner.nextInt();

        System.out.println("Введите второе число");
        array[1] = scanner.nextInt();

        System.out.println("Введите третье число");
        array[2] = scanner.nextInt();

        System.out.println();

        int sumOfArrayElements = 0;
        for (int j : array) {
            sumOfArrayElements += j;
        }
        System.out.println("Сумма элементов массива: " + sumOfArrayElements);

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
        System.out.println("Минимальное значение массива: " + array[0]);
        System.out.println("Максимальное значение массива: " + array[array.length - 1]);
        
        /*
        сортировка тебе здесь не нужна + ты используешь два цикла, здесь хватит и одного
        заведи две переменные: мин и макс
        беги по циклу и считай сумму + проверка если мин больше текущего значения числа в массиве, то присваивай новое значение
        
        самый оптимальный вариант решения задачи - это в цикле просить пользователя ввести числа и сразу считать сумму и проверку на мин/макс.
        */
        
    }
}
