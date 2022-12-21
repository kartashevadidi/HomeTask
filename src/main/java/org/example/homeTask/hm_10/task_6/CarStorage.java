package org.example.homeTask.hm_10.task_6;

public class CarStorage {
    private String сarName;
    private String engineVolume;

    public CarStorage(String сarName, String engineVolume) {
        this.сarName = сarName;
        this.engineVolume = engineVolume;
    }

    @Override
    public String toString() {
        return "CarStorage{" +
                "сarName='" + сarName + '\'' +
                ", engineVolume='" + engineVolume + '\'' +
                '}';
    }
}




