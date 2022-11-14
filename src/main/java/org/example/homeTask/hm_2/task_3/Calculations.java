package org.example.homeTask.hm_2.task_3;

//отформатируй код
public class Calculations {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <=8; i++){
            sum = sum + (1<< i);
        }
        System.out.println(sum);
    }
}
