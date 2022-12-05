package org.example.homeTask.hm_6.task_2;

import java.util.Arrays;

public class Warehouse {
    private String[] shoes;
    private int previousIndex;

    public Warehouse(String[] shoes) {
        this.shoes = shoes;
        this.previousIndex = -1;
    }

    public String next() {
        if (previousIndex == shoes.length - 1) {
            previousIndex = -1;
        }
        String shoesItem = shoes[previousIndex + 1];
        previousIndex++;
        return shoesItem;
    }

    public String[] getArray() {
        return shoes;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "shoes=" + Arrays.toString(shoes) +
                ", previousIndex=" + previousIndex +
                '}';
    }
}
