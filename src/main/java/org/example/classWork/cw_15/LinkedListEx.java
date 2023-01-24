package org.example.classWork.cw_15;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
    public static void main(String[] args) {
        List<String> names = new LinkedList<>(); // linkedList не иммет capacity
        names.add("Olya");
        names.add("Egorka");
        System.out.println(names.contains("Egorka")); // содерржится ли в коллекции
        System.out.println(names.isEmpty()); // пустали я коллекция

        System.out.println(names);
        names.clear();  // удаляет данные в коллекции
        System.out.println(names);
    }

}
