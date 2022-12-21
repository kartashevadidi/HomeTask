package org.example.homeTask.hm_10.task_5;

public class WordArray {
    public static void main(String[] args) {
        String mainLetter = "w";
        String secondMainLetter = "W";

        String[] companyNames = new String[]{"Alfa", "windows", "MegaBrand", "Acropolis", "Workers", "wear",};

        for (int i = 0; i < companyNames.length; i++) {
            if (companyNames[i].startsWith(mainLetter)) {
                System.out.println(companyNames[i]);
            }
            if (companyNames[i].startsWith(secondMainLetter)) {
                System.out.println(companyNames[i]);

            }
        }
    }
}
