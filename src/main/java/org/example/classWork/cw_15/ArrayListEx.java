package org.example.classWork.cw_15;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();  // чаще пишется просто List

        // List<Integer> shortNumbers = List.of(1,2,3,45,6,7); // создается неизменяемая коллекция без возможности добавить доп элемент

        List<Integer> shortNumbersIzmrnyaemo = new ArrayList<>(List.of(1,2,3,4,5,6,7,8)); // создается изменяемая коллекция c возможностью добавить доп элемент (клонирование коллекции)

        ArrayList<String> names = new ArrayList<>(); // создали пустую коллекцию

        //names.trimToSize(); // cравнивает capacity и size

        names.add("Egorka"); //  в этот момент ( при первом разе идет проверка если у нас пустой массив с элемент дата, то только тогда дефолт инитал капасити становится 10

        //  в коллекциях переопределен метод toString

        names.add(0, "Elena");  // добавление по индексу
        names.remove(0);  // удаление по индексу
        names.remove("Egorka"); // удаление по обьекту
        System.out.println(names);

        List<String> names2 = List.of("Kate","Pasha");
        names.addAll(names2);
        System.out.println(names);
        names.removeAll(List.of("Kate"));
        System.out.println(names);

        names.retainAll(List.of("Pasha", "Natasha"));  // пересечение в коллекции
        System.out.println(names);
    }
}
