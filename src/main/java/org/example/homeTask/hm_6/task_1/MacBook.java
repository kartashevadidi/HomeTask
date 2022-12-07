package org.example.homeTask.hm_6.task_1;

public class MacBook implements Computer {
    private String isComputerOn;
    private String isComputerOff;
    private boolean isComputerReset;

    @Override
    public String on() {
        return isComputerOn;
    }

    @Override
    public String off() {
        return isComputerOff;
    }

    @Override
    public boolean reset() {
        return isComputerReset;
    }
}
