package org.example.homeTask.hm_10.task_6;

public class CarStorageMain {
    public static void main(String[] args) {
        CarStorage[] carStorages = new CarStorage[4];
        carStorages[0] = new CarStorage("Mazda", "1.4");
        carStorages[1] = new CarStorage("Opel", "1.4");
        carStorages[2] = new CarStorage("BMW", "1.0");

        for (int i = 0; i < carStorages.length; i++){
            if(carStorages[i].toString().contains("1.4")){
                System.out.println();
            }
        }
    }
}
