package org.example.homeTask.hm_7.task_2;

public class Car implements Engine, Transmission {
    private boolean isEngineOn;
    private int transmissionNumber = 0;
    private int speed = 0;


    @Override
    public void engineTurnOn(boolean on) {
        if (isEngineOn && on) {
            System.out.println("Engine already on");
        }
        if (!isEngineOn && !on) {
            System.out.println("Engine already off");
        }
        isEngineOn = on;
    }

    @Override
    public boolean isEngineOn() {
        return isEngineOn;
    }

    @Override
    public void doHigher() {
        if (transmissionNumber == 7) {
            System.out.println("Transmission already max");
            return;
        }
        transmissionNumber++;
        System.out.println("Current transmission " + transmissionNumber);
    }
    @Override
    public void doLower() {
        if (transmissionNumber == 1) {
            System.out.println("Transmission already min");
            return;
        }
        transmissionNumber--;
        System.out.println("Current transmission " + transmissionNumber);
    }

    public int getSpeed() {
        return speed;
    }

    public void stepOnTheGas() {
        if (!isEngineOn) {
            System.out.println("Start the car");
        }
        if (isEngineOn && transmissionNumber == 0) {
            System.out.println("Turn on the transmission!");
        }
        speed = transmissionNumber * 20;
        System.out.println(speed);
    }


}
