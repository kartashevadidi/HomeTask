package org.example.homeTask.hm_2.task_2;

public class Animal {
    public static void main(String[] args) {
        int animal = 1;
        int totalHours = 24;

        for (int i =0; i <= totalHours; i = i + 3 ){
            animal = animal * 2;

            System.out.println("Days: " + i + " -> Number of animals: " + animal);

        }

    }
}
