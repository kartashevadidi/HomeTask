package org.example.homeTask.hm_6.task_3;

public class VillageHouse implements Building {
    private int floorsCount;
    private boolean isThereHeatingOn;
    private int residentsCount;

    public VillageHouse(int floorsCount, boolean isThereHeating, int residentsCount) {
        this.floorsCount = floorsCount;
        this.isThereHeatingOn = isThereHeating;
        this.residentsCount = residentsCount;
    }

    @Override
    public int getFloorsCount() {
        return 0;
    }

    @Override
    public void turnHittingOn(boolean on) {
        isThereHeatingOn = on;
    }

    @Override
    public boolean isThereHeating() {
        return isThereHeatingOn; // в интерфейсе описал претензию к названию аргумента метода
    }

    @Override
    public int getResidentsCount() {
        return residentsCount;
    }

    @Override
    public String toString() {
        return "VillageHouse{" +
                "floorsCount=" + floorsCount +
                ", isThereHeating=" + isThereHeatingOn +
                ", residentsCount=" + residentsCount +
                '}';
    }
}
