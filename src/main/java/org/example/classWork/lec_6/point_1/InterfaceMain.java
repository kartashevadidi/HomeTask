package org.example.classWork.lec_6.point_1;

public class InterfaceMain {
    public static void main(String[] args) {
        AmericanDog bullDog = new BullDog();

        bullDog.hasVoice();
        bullDog.pee();

        Dog spitz = new Shpits();
        spitz.hasVoice();

        spitz = bullDog;
        spitz.pee();
        spitz.hasVoice();
        bullDog.command("служи");
    }

}
