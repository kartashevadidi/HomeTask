package org.example.classWork.lec_2.point_2;

public class SwitchEx {
    public static void main(String[] args) {


        int month = 14;
        switch (month) {
            case 3 -> System.out.println("Ноябрь");
            case 1 -> System.out.println("Январь");
            case 2 -> System.out.println("Февраль");
            default -> System.out.println("NO");
        }
        System.out.println("Happy end");
    }
}
