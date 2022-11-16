package org.example.homeTask.hm_2.task_6;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) { // в конце этой строки должна быть "{". Всегда используй фигурные скобки для тела цикла //Fixed
            if (i % 2== 0) { // твоя конструкция выглядит неоправданно сложно, проще ведь i % 2 == 0 //Fixed  хотела попробовать
                System.out.println("HEllO figure " + i + "!");
            }
        }
    }
}
