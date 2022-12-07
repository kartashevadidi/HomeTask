package org.example.homeTask.hm_6.task_3;

public class UrbanApartment implements Building {
    private int floorsCount;
    private boolean isThereHeatingOn;
    private int residentsCount;

    public UrbanApartment(int floorsCount, boolean isThereHeating, int residentsCount) {
        this.floorsCount = floorsCount;
        this.isThereHeatingOn = isThereHeating;
        this.residentsCount = residentsCount;
    }

    @Override
    public int getFloorsCount() {
        return floorsCount;
    }

    @Override
    public void turnHittingOn(boolean on) {
        isThereHeatingOn = on; // в интерфейсе описал претензию к названию аргумента метода
    }

    @Override
    public boolean isThereHeating() {
        return isThereHeatingOn;
    }

    @Override
    public int getResidentsCount() {
        return residentsCount;
    }

    @Override
    public String toString() {
        return "UrbanApartment{" +
                "floorsCount=" + floorsCount +
                ", isThereHeating=" + isThereHeatingOn +
                ", residentsCount=" + residentsCount +
                '}';
    }
}
