package org.example.classWork.lec_6.point_1;

public interface Dog {
    boolean hasName = false;

    boolean hasVoice();
    default void pee() {
        System.out.println("Хожу 3 раза");
    }

}
