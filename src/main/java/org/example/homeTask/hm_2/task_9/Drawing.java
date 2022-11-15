package org.example.homeTask.hm_2.task_9;

public class Drawing {
    public static void main(String[] args) {
        int i, j, count = 4; // рвение сократить количество строк кода это хорошо, но переменные лучше создавать каждую в отдельной строке.
        //предложу тебе еще count переименовать в size, но это мелочь
//Tringle -> Triangle
        for (i = 1; i <= count; i++) { // i = 1 -> int i = 1, не вижу смысла выносить i,j за пределы цикла
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println(" ");
// Reverse Tringle -> Triangle
        for (i = count; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}

