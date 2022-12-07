package org.example.homeTask.hm_6.task_3;

public interface Building {

    int getFloorsCount();

    void turnHit(boolean on); // зачем аргумент, если он называется on? Тогда луше метод назвать turnHittingOn

    boolean isThereHeating();

    int getResidentsCount();

//пустая строка не нужна
}
