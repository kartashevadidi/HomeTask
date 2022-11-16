package org.example.homeTask.hm_3.task_4;

public class MultiplicationTable {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, // а если таблицаумножения будет до 100, тоже будешь через запятую? создаем массив, заполняем его в цикле и затем печатаем
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
        };
        for (int i = 0; i < array[0].length; i++) { // я думаю array[0].length можно смело заменить на array.length. Зачем тебе сдесь указывать индекс 0?
            for (int j = 0; j < array[1].length; j++) { // я думаю array[1].length можно смело заменить на array[i].length. Зачем тебе сдесь указывать индекс 1?
                System.out.println(array[0][i] + " x " + array[1][j] + " = " + array[0][i] * array[1][j]);
            }
            System.out.println();
        }
        
        /* когда мы пишем программу, мы должны думать как они будет работать на разных данных. 
        Например, в цикле должны быть индексы текущей итерации, а не константа вроде 1 или 0
        */
    }
}
