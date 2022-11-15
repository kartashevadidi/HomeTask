package org.example.homeTask.hm_2.task_5;

public class InchTranslations {
    public static void main(String[] args) {
        double centimetresInInch = 2.54;
        double quantityInches = 20;

        System.out.println("Conversion from inches to centimeters");

        for (double b = 0; b <= quantityInches; b++) {
            System.out.print(b + " = ");
            System.out.println(b * centimetresInInch);
        }
    }
}
