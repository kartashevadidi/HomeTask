package org.example.lec_2.point_5;

public class ReturnEx {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 5) {
                    return;
                }
                System.out.println("j= " + j);

            }
            System.out.println("i= " + i);
        }
        System.out.println("Heeeey");
    }
}


