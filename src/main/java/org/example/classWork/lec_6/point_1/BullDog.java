package org.example.classWork.lec_6.point_1;

public class BullDog implements AmericanDog {
    private boolean hasVoice;

    public boolean hasVoice() {
        return hasVoice;
    }

    public void pee() {
        System.out.println("kzkzkz");
    }
    public void bite(){
        System.out.println("укушу");
    }

    @Override
    public void command(String command) {
        System.out.println("готов служить" + command);
    }
}
