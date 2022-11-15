package org.example.homeTask.hm_2.task_6;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
//эта строка лишняя
        for (int i = 1; i <= 100; i++) // в конце этой строки должна быть "{". Всегда используй фигурные скобки для тела цикла
            if (i % 2 != 1) { // твоя конструкция выглядит неоправданно сложно, проще ведь i % 2 == 0
                System.out.println("HEllO figure " + i + "!");
            }
    }
}
