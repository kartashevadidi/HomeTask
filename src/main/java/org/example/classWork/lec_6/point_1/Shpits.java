package org.example.classWork.lec_6.point_1;

public class Shpits implements Dog {
    private boolean hasVoice;
    @Override
    public boolean hasVoice() {
        System.out.println("Хороший шпиц");
        return hasVoice;
    }
}
