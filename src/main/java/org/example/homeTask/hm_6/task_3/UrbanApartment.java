package org.example.homeTask.hm_6.task_3;

public class UrbanApartment implements Building {
    private int floorsCount;
    private boolean isThereHeating;
    private int residentsCount;

    public UrbanApartment(int floorsCount, boolean isThereHeating, int residentsCount) {
        this.floorsCount = floorsCount;
        this.isThereHeating = isThereHeating;
        this.residentsCount = residentsCount;
    }

    @Override
    public int getFloorsCount() {
        return floorsCount;
    }

    @Override
    public void turnHit(boolean on) {
        isThereHeating = on; // в интерфейсе описал претензию к названию аргумента метода
    }

    @Override
    public boolean isThereHeating() {
        return isThereHeating;
    }

    @Override
    public int getResidentsCount() {
        return residentsCount;
    }

    @Override
    public String toString() {
        return "UrbanApartment{" +
                "floorsCount=" + floorsCount +
                ", isThereHeating=" + isThereHeating +
                ", residentsCount=" + residentsCount +
                '}';
    }
}
