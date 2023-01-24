package org.example.classWork.cw_15;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapEx {
    public static void main(String[] args) {
        Map<String, List<Student>> schoolClasses = new HashMap<>();

        schoolClasses.put("1A", // это ключ
                List.of(new Student("Egorka"), new Student("Olya")) // значение
        );
        schoolClasses.put("2B", // это ключ
                List.of(new Student("Kate"), new Student("Oleg")) // значение
        );
        System.out.println(schoolClasses);

    }
}
