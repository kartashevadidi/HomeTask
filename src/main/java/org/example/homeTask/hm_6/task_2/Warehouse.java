package org.example.homeTask.hm_6.task_2;

import java.util.Arrays;

public class Warehouse {
    private String[] shoes; // можешь оставить так, но лучше сделать Shoes[] shoes
    private int previousIndex = -1;

    public Warehouse(String[] shoes) {
        this.shoes = shoes;
    }

    public String next() {
        if (previousIndex == shoes.length - 1) {
            previousIndex = -1;
        }
        String shoesItem = shoes[previousIndex + 1]; // поменяй строки 18 и 19 местами, тогда можно будет убрать +1 // я думала что после ретурн нельзя что-то писать
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
