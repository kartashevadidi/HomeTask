package org.example.homeTask.hm_4.task_3;

import org.example.homeTask.hm_4.task_2.CustomerData;

public class objectArray { // Название класса с большой буквы + название ObjectArray подходит для класса, внутри которого будет содержаться мессив, здесь у тебя метод main.
                            //лучше придумать другое название
    public static void main(String[] args) {
        CustomerData[] customerData = new CustomerData[2];
        customerData[1] = new CustomerData("Dianaaaaa", 20);
        customerData[0] = new CustomerData();

        for (CustomerData customerDatum : customerData) {
            System.out.println();
            System.out.println("Name: " + customerDatum.nameCustomer); // создай метод toString() как мы делали на занятии и используй его для распечатки
            System.out.println("Age: " + customerDatum.ageCustomer);
        }
    }
}
