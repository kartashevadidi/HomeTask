package org.example.homeTask.hm_6.task_3;

import java.util.Arrays;

public class HouseCatalogue {
    private Building[] houseCatalogue;

    public HouseCatalogue(Building[] houseCatalogue) {
        this.houseCatalogue = houseCatalogue;
    }

    public Building[] getHouseCatalogue() {
        return houseCatalogue;
    }

    @Override
    public String toString() {
        return "HouseCatalogue{" +
                "houseCatalogue=" + Arrays.toString(houseCatalogue) +
                '}';
    }
}
