package org.example.homeTask.hm_6.task_3;

import java.awt.*;

public class BuildingMain {
    public static void main(String[] args) {
        Building[] houseArray = new Building[]{
                new UrbanApartment(10, true, 100),
                new VillageHouse(2, false, 10),
                new VillageHouse(3, true, 15),
                new UrbanApartment(19, true, 143)
        };
        HouseCatalogue houseCatalog = new HouseCatalogue(houseArray);
        // не оставляй закомментированный код в готовом варианте
        //       System.out.println(houseCatalog.toString());
    }
}
