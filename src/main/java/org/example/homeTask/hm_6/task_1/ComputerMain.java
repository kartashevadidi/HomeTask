package org.example.homeTask.hm_6.task_1;

// ComputerMain - мы так обычно называем классы с методом main() внутри. Вариантов названий много - Notebook,Laptop, MacBook, Tablet...
public class ComputerMain implements Computer {
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
