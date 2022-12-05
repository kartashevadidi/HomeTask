package org.example.homeTask.hm_6.task_3;

public class VillageHouse implements Building {
    private int floorsCount;
    private boolean isThereHeating;
    private int residentsCount;

    public VillageHouse(int floorsCount, boolean isThereHeating, int residentsCount) {
        this.floorsCount = floorsCount;
        this.isThereHeating = isThereHeating;
        this.residentsCount = residentsCount;
    }

    @Override
    public int getFloorsCount() {
        return 0;
    }

    @Override
    public void turnHit(boolean on) {

    }

    @Override
    public boolean isThereHeating() {
        return false;
    }

    @Override
    public int getResidentsCount() {
        return 0;
    }

    @Override
    public String toString() {
        return "VillageHouse{" +
                "floorsCount=" + floorsCount +
                ", isThereHeating=" + isThereHeating +
                ", residentsCount=" + residentsCount +
                '}';
    }
}
